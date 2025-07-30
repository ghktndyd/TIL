# 1. Generic

- Generic은 영어로 "일반적인", "범용적인" 뭐 이런 뜻이다.
- 그래서 Generic이라는 이름이 왜 붙었는지 생각해보면 **하나의 코드로 여러 타입을 처리할 수 있게 해준다는 의미**에서 붙었을 거 같다.
- 제네릭(Generic)은 자바에서 클래스가 메서드가 사용할 데이터 타입을 작성 시에 파라미터처럼 만들어서 타입 안정성을 보장해주는 기능

---

# 2. 제네릭이 왜 필요한가?

- 제네릭은 Java 1.5부터 나왔음

### 제네릭이 등장하기 전

```java
List list = new ArrayList();
list.add("hello");
list.add(123);  // 문제 없음

String s = (String) list.get(0); // OK
String t = (String) list.get(1); // 런타임 에러: ClassCastException
```

- 컴파일러가 타입을 체크할 수가 없음
- 그래서 만약에 타입을 잘못 명시한다면 `ClassCastException`이 발생함
- 한마디로 타입 안정성이 부족함

### 제네릭 등장 이후

```java
List<String> list = new ArrayList<>();
list.add("hello");
list.add(123);  // 컴파일 에러 발생

String s = list.get(0);  // 안전하게 사용 가능
```

- 컴파일 타입에 `<>` 타입 파라미터에 걸맞지 않은 타입을 추가한다면 컴파일 에러가 발생함
- 캐스팅이 필요 없어짐
- 한마디로 가독성과 안정성이 증가함

---

# 3. 제네릭의 경계 (Bounded Type Parameters)

### 상한 제한 (Upper Bound)

```java
public <T extends Number> void process(T item) {
    // T는 Number 혹은 Number의 하위 타입만 가능
}
```

- `process(10), process(3.14)`는 가능함 (Number 타입의 하위라서)
- `process("글자")`는 컴파일 에러 (String은 Number의 하위가 아님)

### 하한 제한 (Lower Bound)

```java
public void addNumbers(List<? super Integer> list) {
    list.add(10); // Integer는 넣을 수 있음
    // 즉 Integer 혹은 Integer의 상위 타입만 가능
}
```

- `List<Integer>`, `List<Number>`, `List<Object>` 가능
- 하지만 `get()`으로 꺼내면 `Object`로 나옴 (타입 안정성을 위해서)

---

# 4. 제네릭 와일드카드와 변성

## 4-1. 와일드카드

- 제네릭에서 정확한 타입을 모르거나 신경쓰지 않을 때 `?` 기호로 나타냄
- 여기서 `?`에는 어떤 타입이든 올 수 있다.
- 하지만 `List<?>`와 `List<Object>`는 다르다. `<?>`는 타입이 미상이라는 것을 의미함

## 4-2. 변성

- 타입 간의 상하관계가 제네릭 타입에 어떻게 반영되는지에 대한 성질
- 제네릭은 기본적으로 무공변 성질을 가짐
- 예를 들어서 `Integer`가 `Number`의 하위 타입이라고 해서 `List<Integer>`가 `List<Number>`의 하위 타입은 아니다.
- 무공변의 개념은 "S가 T는 서로 무관하다" 라는 개념이다.

### 변성의 종류

| 이름  | 문법            | 읽기 | 쓰기 | 예시 사용                    | 의미         |
|-----|---------------|----|----|--------------------------|------------|
| 무공변 | `T`           | ✅  | ✅  | `List<T>`                | 정확히 T      |
| 공변  | `? extends T` | ✅  | ❌  | `List<? extends Number>` | T 또는 하위 타입 |
| 반공변 | `? super T`   | ❌  | ✅  | `List<? super Integer>`  | T 또는 상위 타입 |

### 무공변

```java
List<Number> list = new ArrayList<Integer>(); // 컴파일 에러
```
- 자바에서 제네릭은 기본적으론 무공변이다.
- 그렇기에 `List<Number>`와 `List<Integer>`는 관계가 없다.

### 공변

```java
List<? extends Number> numbers = new ArrayList<Integer>();
```
- 개념: S가 T의 하위면 `List<S>`는 `List<T>`의 하위 타입이다.
- 읽기만 가능하다. (쓰기는 금지한다.)
  - 컴파일러는 기본적으로 `<? extends Number>`에 대입될 정확한 타입을 모른다.
  - `List<Integer>`일 수도 있고,
  - `List<Double>`일 수도 있고,
  - `List<Number>`일 수도 있다.
- 그렇기 때문에 컴파일러는 안전하게 `Number`로만 읽을 수 있게 해준다.
- 사용처: 읽기 전용 파라미터, 상속 구조를 가진 리스트를 읽기만 해도 될 때

### 반공변

```java
List<? super Integer> list = new ArrayList<Number>();
list.add(10); // ✅ 가능
```

- 개념: S가 T의 하위면 `List<T>`는 `List<S>`의 하위 타입이다.
- 즉 공변의 반대다.
- 쓰기만 가능하다. (읽기가 가능은 한데 Object로만 추출됨)

```java
list.add(10);                 // ✅ 가능
Integer x = list.get(0);      // ❌ 컴파일 에러
Object y = list.get(0);       // ✅ 가능
```
- 컴파일러는 `<? super Integer>`에 대입될 정확할 타입을 모름
  - `List<Number>`일 수도 있고,
  - `List<Object>`일 수도 있다.
- 그렇기 때문에 컴파일러가 `Integer`를 추가하는 것은 안전하다고 판단하고 해준다.
- 하지만 어떤 타입으로 나올지는 모르기 때문에 `Object`로만 추출 가능한 것이다.
- 사용처: 데이터를 추가만 해야 할 때, 필터링, 컬렉션에 넣기 등등

### PECS (Producer Extends, Consumer Super)

- 외부의 데이터로 생산(Producer)해야 한다면 extends
- 외부의 데이터로 소비(Consumer)해야 한다면 super

### 사용 예시

#### 공변 (? extends T)
```java
public void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
```
- `List<Integer>`, `List<Double>` 등을 받아서 읽기 전용으로 사용

#### 반공변 (? super T)
```java
public void addNumbers(List<? super Integer> list) {
    list.add(10);  // OK
}
```
- 파라미터로 받은 list는 어쨌든 `Integer`의 상위타입이기에 `10`을 안전하게 넣을 수 있음
