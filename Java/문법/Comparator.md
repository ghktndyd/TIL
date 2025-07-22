# Comparator

- 두 객체 사이의 정렬 기준을 외부에서 정의하는 전략 객체
- "외부에서 정의" 한다는 게 중요하다.
- 스스로를 비교 대상과 비교하는 `Comparable`과 다른 지점
- `Comparator`는 **2개의 객체 (o1, o2)**를 비교한다.
- 또한 다양한 정렬 기준을 유연하게 만들 수 있다.

---

# Comparator의 인터페이스 시그니처

```java
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}

// Comparable 인터페이스 시그니처
public interface Comparable<T> {
    int compareTo(T o);
}
```

- 반환값이 `int`인 거는 `Comparable`과 똑같은 이유 때문임
- `음수`: o1 < o2
- `0`: 같은 객체
- `양수`: o1 > o2
- `Comparator`는 2개의 객체를 비교하고,
- `Comparable`은 자신과 매개변수 객체를 비교


---

# Comparator가 왜 중요할까?

### Comparator는 Comparable보다 유연하다.

- `Comparable`은 클래스당 정렬 기준을 하나만 정할 수 있다.
- `Comparator`는 원하는만큼 정렬 기준을 만들 수 있다.

```java
Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);
Comparator<Person> byName = Comparator.comparing(Person::getName);
Comparator<Person> byAgeDesc = byAge.reversed;
```

### Comparator는 타 클래스도 정렬이 가능하다.

- `Comparable`을 구현하지 않은 클래스라도 `Comparator`만 있으면 정렬이 가능하다.

```java
// 이건 내가 만든 클래스가 아니라, 어떤 라이브러리에서 가져온 클래스라고 생각해보자
public class Car {
    private String model;
    private int topSpeed;

    // 생성자, getter만 존재, Comparable 구현 X
}
```
- 위 객체를 정렬하려고 한다면 컴파일 에러가 발생할 것이다. 왜냐면 `Comparable`을 구현하지 않았기 때문이다.
- 하지만 `Comparator`를 사용한다면
```java
List<Car> cars = new ArrayList();
Comparator<Car> bySpeed = Comparator.comparingInt(Car::getTopSpeed);

Collections.sort(cars, bySpeed);
```
- 위와 같은 형태로 순서 정렬을 할 수 있다.

--- 

# `Comparator`의 주요 메서드 

### `comparing()`
```java
Comparator<Person> byName = Comparator.comparing(Person::GetName);
```
- 정렬 기준이 되는 **keyExtractor**를 인자로 받아서 Comparator 객체를 생성한다.
- keyExtractor: 정렬이 되는 필드의 값을 추출하는 메서드 (보통은 Getter)

### `thenComparing()`
```java
Comparator<Person> byNameThenAge = 
    Comparator.comparing(Person::getName)
            .thenComparing(Person::getAge);
```
- 다중 정렬 기준을 설정할 수 있게 해줌 (위는 우선 name, 그 다음이 age)
- SQL로 바꾸면 `ORDER BY name, age`와 같은 효과다,

### `reversed()`
```java
Comparator<Person> byAgeDesc =
    Comparator.comparing(Person::getAge)
            .reversed();
```
- 오름차순 정렬을 내림차순으로 뒤집음

### `nullsFirst() / nullsLast()`
```java
Comparator<Person> nullSafe =
    Comparator.nullsFirst(Comparator.comparing(Person::getName));
```
- Null이 앞에 올지 뒤에 올지 설정해줄 수 있음

### `naturalOrder() / reverseOrder()`
```java
Comparator<String> natural = Comparator.naturalOrder(); // a < b < c
Comparator<String> reverse = Comparator.reverseOrder(); // c > b > a
```

- 이 메서드는 `Comparable`을 구현한 클래스에서만 사용이 가능함



