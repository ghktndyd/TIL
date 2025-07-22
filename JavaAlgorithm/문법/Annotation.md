# 어노테이션

- 자바에서 코드에 부가적인 **메타데이터**를 제공하기 위한 문법 요소
- 프로그램 동작에는 큰 영향을 주진 않지만 컴파일러나 프레임워크, 런타임 시점에 해당 정보를 보고 특정 동작을 할 수 있도록 힌트를 제공하는 정도임

---

# 어노테이션 사용 예시

```java
@Override
public String toString() {
    // 구현    
}
```

- `@Override` 어노테이션은 컴파일러가 오버라이딩한 메서드라고 알려준다.
- 하지만 저걸 붙였다고 해서 코드 동작에 영향이 있는지 생각해보면 전혀 없다는 걸 알 수 있다.

---

# 어노테이션을 정의하는 방법

- 자바에서 어노테이션은 **인터페이스**와 유사하게 선언된다.

```java
public @interface CustomAnnotation {
    String value();
    int count() default 0;
}
```
: 위에서 선언한 어노테이션을 사용한다면

```java
@MyAnnotation(value = "김수용", count = 3)
public class MyClass {}
```
- `@interface` 키워드로 선언한다.
- 메서드처럼 생긴 얘들이 **요소**들이다.
- `default` 키워드로 **기본값**을 설정할 수 있다.

---

# 어노테이션을 지정할 때 쓰는 메타 어노테이션

- 어노테이션도 자체적으로 **메타 어노테이션**을 가질 수 있음

| 메타 어노테이션      | 설명                                                         |
|---------------|------------------------------------------------------------|
| `@Target`     | 어노테이션을 적용할 수 있는 **대상 종류** 지정 (`TYPE`, `METHOD`, `FIELD` 등) |
| `@Retention`  | 어노테이션의 **유지 정책** 지정 (`SOURCE`, `CLASS`, `RUNTIME`)         |
| `@Documented` | JavaDoc에 포함 여부                                             |
| `@Inherited`  | 부모 클래스의 어노테이션을 자식 클래스가 상속받을 수 있게 함                         |

```java
@Target(ElementType.METHOD) // 메서드에 붙이는 어노테이션
@Retention(RetentionPolicy.RUNTIME) // JVM 메타 정보로 로딩됨
public @interface Test {}
```

---

# 어노테이션 Retention Policy

- 어노테이션의 유지 정책이다. 즉 언제까지 어노테이션이 생존할 수 있는지를 지정하는 설정이다. 

### Retention Policy 종류

| 정책        | 설명                              | 컴파일러에서 유지? | JVM에서 로딩됨? | 리플렉션 접근 가능? |
|-----------|---------------------------------|------------|------------|-------------|
| `SOURCE`  | **소스 코드에만 존재**                  | ❌ 삭제됨      | ❌ 아예 없음    | ❌ 불가능       |
| `CLASS`   | 컴파일된 **`.class` 파일까지 존재**       | ✅ 포함       | ❌ JVM 무시   | ❌ 불가능       |
| `RUNTIME` | `.class` 파일 + **JVM 메모리에도 올라감** | ✅ 포함       | ✅ JVM에 있음  | ✅ 가능        |

### 1. `SOURCE`

```java
@Retention(RetentionPolicy.SOURCE)
public @interface DevNote {}
```
- 컴파일 시점에는 완전히 사라지는 정책임
- `.class` 파일에는 들어가지 않기 때문에 JVM이 해당 어노테이션이 존재하는지 조차 모른다.
- 오직 컴파일러만을 위한 메타데이터다. (예로 @Override 같은 역할)

### 2. `CLASS`

```java
@Retention(RetentionPolicy.CLASS)
public @interface EntityMarker {}
```

- 컴파일을 한 이후에 `.class` 파일에 같이 들어간다.
- 하지만 JVM의 `Metaspace(Method Area)` 영역에는 로딩되지 않는다.
- 이 말은 즉 리플렉션으로는 읽을 수 없다.

### 3. `RUNTIME`

```java
@Retention(RetentionPolicy.RUNTIME)
public @interface MyService {}
```

- 컴파일 후에 `.class` 파일에 같이 저장된다.
- JVM이 로딩할 때 어노테이션 정보를 같이 읽고, `Metaspace` 영역에 저장한다.
- 그래서 `Class.getAnnotation(...)`을 통해서 리플렉션으로 읽을 수 있다.

- Spring, Hibernate 같은 런타임 기반 프레임워크들은 대부분 이 유지 정책을 사용한다.

---

# JVM은 어노테이션을 어떤 원리로 처리할까?

### 1. 자바 코드는 컴파일 되면 `.class` 파일이 된다.
- .class 파일이 되면 어노테이션은 클래스의 메타데이터에 저장된다. (`RuntimeVisibleAnnotations`)
- 이때 `@Retention` 속성에 따라서 어노테이션을 `.class` 파일에 어느 수준까지 유지할지를 결정한다.

- `.class` 파일 (바이트 코드 구조)
```java
RuntimeVisibleAnnotations_attribute {
    u2 num_annotations;
    annotation annotations[num_annotations];
}
```
- 위 구조는 **JVM의 클래스로더가 로딩할 때 메타스페이스 영역에 함께 올라간다.**
- 이때 올라가는 것은 실제 객체가 아니다. 그저 구조화된 메타데이터일 뿐이다.
- RetentionPolicy.RUNTIME인 경우 이 정보가 리플렉션을 통해 접근 가능한 메타정보에 포함돼서 올라간다는 뜻이다.

### 2. 어노테이션을 리플렉션으로 요청한다.

```java
Class<?> clazz = MyClass.class;
MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
```

- 위 코드를 실행하면
- 1. JVM은 `clazz`에 저장된 `Class<?>` 객체 내부의 `annotationData()`를 참조
- 2. 이 안에는 어노테이션 이름과 값을 가진 `Map<Class<?>, Annotation>`이 있는데
- 3. 이 중에서 `MyAnnotation.class`에 해당하는 항목을 찾는다.

### 3. 어노테이션 프록시 객체를 생선한다.

- 자바에서 어노테이션은 `interface`이므로 직접 인스턴스를 만들 수 없다.
- 이 때문에 JVM은 어노테이션을 동적 프록시 객체로 생성한다.

```java
Proxy.newProxyInstance(
    classLoader,
    new Class<?>[]{MyAnnotation.class},
    new AnnotationInvocationHandler(MyAnnotation.class, Map.of("value", "Hello"))
)
```
- 코드 설명을 하자면
- `AnnotationInvocationHandler`는 내부적으로 값을 저장한다.
- `value()` 메서드가 호출되면 저장된 값을 반환한다.

### 4. 최종 반환은 프록시 객체다.

- 어노테이션 객체는 실제로는 프록시 객체다.
- `annotation.getClass()`는 `com.sun.proxy.$ProxyNN` 과 같은 이름임을 확인할 수 있다.
- 내부적으로 `value()` 호출이 온다면 `invoke()`를 통해서 값을 반환한다.