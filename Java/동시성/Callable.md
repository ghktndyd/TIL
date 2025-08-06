## Callable

- 자바 5에서 추가됨
- `java.util.concurrent` 패키지에 있는 **함수형 인터페이스**
- Runnable과 유사하지만 확연하게 다름

### Callable과 Runnable

- Runnable은 반환값이 없음, Callable은 반환값이 있음
- Runnable은 CheckedException을 던질 수 없음, Callable은 Checked Exception을 던질 수 있음
- Runnable은 Thread나 Executor에서 사용하고, Callable은 ExecutorService에서만 사용

```java
@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}
```
- 제네릭 타입인 `V`로 인해서 반환 값 타입을 지정할 수 있다.
- `throw Exception`로 인해서 Checked Exception을 던질 수 있다.

---

## Callable 사용

### 1. Callable 객체 생성
```java
Callable<String> task = () -> {
    Thread.sleep(1000);  // 1초 대기
    return "Callable 결과";
};
```

### 2. ExecutorService 생성하기 (스레드 풀)
Callable은 ExecutorService를 통해서 실행한다.

```java
ExecutorService executor = Executors.newFixedThreadPool(3);
// 또는 Executors.newSingleThreadExecutor();
```
- `newFixedThreadPool(3)`은 최대 3개의 스레드로 작업을 실행한다.
- `SingleThreadExecutor`는 싱글 스레드만 사용한다.

### 3. Callable 작업 제출 (submit 메서드)
Runnable은 Thread로 실행했지만 Callable은 `ExecutorService.submit()`을 사용해야 한다.
여기서 `submit()` 메서드는 `Future` 객체를 반환한다.
`Future`는 작업이 끝나면 결과를 받아올 수 있는 결과 핸들러 역할을 한다고 생각하자

```java
Future<String> future = executor.submit(task);
```

### 4. Future로 결과 받기 (get 메서드)

```java
String result = future.get();  // 결과 받을 때까지 대기 (블로킹)
System.out.println("결과: " + result);
```

- `get()` 메서드는 작업이 끝날 때까지 기다렸다가 결과를 반환한다.
- 작업이 끝나지 않았다면 블로킹 상태로 대기한다.

비동기적으로도 체크가 가능하다.

```java
while (!future.isDone()) {
    System.out.println("작업 진행 중...");
    Thread.sleep(500);
}
String result = future.get();
System.out.println("결과: " + result);
```
- `isDone()` 메서드는 작업 완료 여부를 파악 가능하다.
- 위 예제처럼 작업 완료 여부를 체크하면서 비동기 폴링도 가능하다.

### 5. ExecutorService 종료하기

```java
executor.shutdown();
```
- 작업이 끝나면 ExecutorService를 종료해야지 자원 누수가 안 생긴다.

### 6. 전체 예시를 보자

```java
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Callable 결과!";
        };

        Future<String> future = executor.submit(task);

        System.out.println("작업 요청 완료!");

        String result = future.get();  // 결과 기다리기 (블로킹)
        System.out.println("작업 결과: " + result);

        executor.shutdown();
    }
}
```