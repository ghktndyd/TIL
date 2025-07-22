# Comparable

- 자바에서 자기 자신이 다른 객체와 "기본 비교 기준"을 제공하는 인터페이스
- 기본 비교 기준: 이 객체가 외부 정보 없이 정렬될 때 어떤 순서로 정렬되어야 하는지 스스로 정의하는 기준
- 한마디로 `Comparable` 인터페이스는 객체가 스스로 "나는 이 기준으로 정렬되어야 해" 라고 정렬 기준을 제공하는 거라고 생각하면 댐

---

# Comparable 인터페이스 시그니처

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

- `T`는 비교 대상의 타입
- `compareTo()`는 3가지 값을 반환한다.
    - `음수`: this < o (스스로가 비교 객체보다 비교 결과가 작을 때)
    - `0`: this == o (자신이 비교 객체와 비교 결과가 같을 때)
    - `양수`: this > o (스스로가 비교 객체보다 비교 결과가 클 때)

--- 

# Comparable을 구현했을 때 이점

1. `Collections.sort(list)`에서 자동 정렬됨

2. `TreeSet`, `TreeMap`에서 자동 정렬의 기준이 생김

3. `PriorityQueue`에서 우선순위의 기준이 됨

4. `equals()`와 정렬이 일치해야 안정적임

---

# Comparable의 규칙

- 자바 공식 문서에서 정의한 Comparable의 5대 규칙
- 안 지키면 TreeSet, TreeMap 같은 equals 기반 컬렉션에서 버그가 발생할 수 있음

### 1. 반사성 (Reflexivity)

```java
x.compareTo(x) == 0
```
자기 자신과 비교하면 당연하게도 0이 나와야 한다.

### 2. 대칭성 (Symmetry)

```java
sign(x.compareTo(y)) == -sign(y.compareTo(x))
```

x가 y보다 크다면, y는 x보다 작아야 한다.
이게 안 지켜진다면 정렬이 꼬이고 무한루프가 생길 수 도 있음

### 3. 추이성 (Transitivity)

```java
if (x > y && y > z), then x > z
```

x가 y보다 크고, y는 z보다 크다면 당연하게도 x는 z보다 커야 한다.

### 4. 일관성 (Consistency)

```java
x.compareTo(y) == 0 // 이 결과는 계속 같아야 함
```

- 일관성이 깨진다면 정렬할 때마다 결과가 계속 바뀌게 된다.

### 5. compareTo와 equals의 일관성

- `x.compareTo(y) == 0`이면 `x.equals(y) == true`여야 좋다.
- 필수 조건은 아니다. 하지만 `SortedSet`, `SortedMap` 같은 컬렉션에선 매우 중요하다.

예시로 보자

```java
public class User implements Comparable<User> {
    String name;
    int id;

    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }

    public boolean equals(Object o) {
        // id를 기준으로 비교
    }
}
```

- compareTo는 `name`을 기준으로 판단하기에 이름이 같은 두 객체를 비교하면 같은 객체라고 판별할 것이다.
- 하지만 equals는 `id`를 기준으로 판단하기에 이름이 같은 두 객체여도 id가 다르면 다른 객체로 판단한다.
- 만약 이렇다면 `TreeSet`에서는 compareTo 기준으로 동작하기에 두 번째 객체를 무시한다.
- 하지만 `HashSet`에서는 equals 기준으로 동작하기에 두 번째 객체로 저장될 것이다.
- 컬렉션의 일관성이 붕괴되어 버린다.

---

# 실무에서 발생할만한 실수

### 1. compareTo에 `Null`을 전달하는 경우

```java
this.name.compareTo(other.name) // NPE 발생
```

항상 `NULL` 체크를 하거나 `Comparator.nullsFirst()`를 써야 안전하다.


### 2. 숫자 직접 빼는 경우

```java
return this.money - other.money;
```

만약 가진 액수의 차이가 `Integer.MAX_VALUE`를 넘으면 **오버플로우** 터짐

정석대로라면

```java
return Integer.compare(this.money, other.money);
```

---

