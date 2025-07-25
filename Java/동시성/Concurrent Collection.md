# 1. Concurrent의 뜻

- Concurrent는 컴퓨터과학 용어로는 "동시성"을 의미한다.
- 병렬을 의미하는 "Parallel" 이라는 용어하고는 다르다.
- Concurrent는 시간을 나눠가며 동시에 실행되는 것처럼 보이는 것이고, Parallel은 실제로 동시에 실행되는 것이 차이다.
- 자바에서는 기본 컬렉션들이 멀티스레드 환경에서 스레드 세이프하지 않아서 여러 스레드가 공유 자원에 동시 접근하면 예상 못한 에러가 발생할 수 있다.

---

# 2. 동기화 컬렉션을 알기 위한 개념

## 2-1. Race Condition (경쟁 상태)

- 여러 스레드가 동시에 공유 자원에 접근할 때 예상치 못한 결과를 초래하는 상황을 말한다.
- 여기서 예상치 못한 결과는 데이터의 정합성이 깨지는 것을 의미함

## 2-2. Deadlock (교착 상태)

- 두 개 이상의 스레드가 서로 자원을 점유한 상태에서 상대방의 락을 기다리면서 무한 대기 상태에 빠지는 현상이다.
- 이 현상은 잘못된 락 설계로 인해서 발생한다.

## 2-3. Synchronized (전통적인 락)

- 자바에서는 `synchronized` 키워드를 사용하면 **공유 자원에 하나의 스레드만 접근이 가능하도록 설정**할 수 있다.
- 단점은 전체 블럭에 락을 걸기 때문에 성능이 저하된다
- 자바에서 `Collections.synchronizedList()` 같은 동기화 래퍼들이 모든 메서드에 Synchronized가 걸려있다. 그래서 경쟁이 심한 상황에서는 성능이 많이 안 좋다.

## 2-4. Lock-Free (비동기 동시성의 핵심)

- 락을 사용하지 않고, 스레드간 충돌을 원자적으로 해결하는 기법
- 원자적이라는 것은 어떤 연산을 쪼갤 수 없는 하나의 단위로 판단하고, 그 연산 도중에 다른 스레드가 못 끼어들게 하는 방식으로 해결
- 자바에서 원자적 처리는 내부적으로 JVM이 `native code`로 원자적 명령어를 호출
- 결론은 락이 없으니까 락을 획득하기 위한 기다림이 없음
- 자바에서는 CAS 연산으로 Lock-Free를 구현

## 2-5. Lock Splitting (락 분할)

- 단일 자원 전체에 락을 하나로 걸면 성능 문제가 발생
- 그렇다면 자원을 쪼개서 쪼갠 자원마다 따로 락을 건다는 개념으로 발전
- 이 개념이 "락 분할"
- 자바 8 이상의 ConcurrentHashMap 같은 구조에서는 각각의 해시 버킷에서만 락/CAS를 사용
- 가능하다면 CAS로 처리하지만 충돌이 발생한 경우에는 아주 좁은 범위에 락을 적용

## 2-6. CAS (Compare And Swap)

- CAS는 **비교하고 교환**의 약자고, 특정 값이 예상한 값과 일치할 때만 값을 변경하는 원자적인 연산이다.
- 락 없이 동기화를 구현할 수 있는 방법
- CAS는 세 가지 요소로 구성된다:
    1. **메모리 위치**: 값을 변경할 메모리 위치
    2. **예상 값**: 메모리 위치에 있는 값이 이 값과 일치해야 함
    3. **새로운 값**: 예상 값과 일치할 때 메모리 위치에 설정할 새로운 값
- CAS 과정:
    1. 메모리 위치의 현재 값을 읽음 (oldValue)
    2. 예상 값과 oldValue를 비교 (expectedValue)
    3. 만약 oldValue가 expectedValue와 같다면 메모리 위치에 새로운 값을 설정 (newValue)
    4. 아니면 실패 -> 다시 시도

---

# 3. 각각 동기화 방식을 비유하자면

## Lock: 티켓 예매할 때 예매 창구에는 1명씩만 들어갈 수 있음

- 1명이 들어가면 다음 사람은 앞 사람이 예매를 다 하고 나올 때까지 기다려야함
- 매우 안전하지만 느림
- 자바에서는 `synchronized`, `ReetrantLock`

## Lock-Free: 마지막 티켓 1장을 보고 여러 사람이 예매 버튼 누른 상황

- 여러명이 동시에 눌러도 서버의 판단 하에 무조건 0.000001초라도 빨리 누른 사람에게 티켓을 줌
- 다음 사람은 실패 응답을 받고, 다시 시도
- 누구든 바로 시도 가능하고, 락이 없다 보니까 빠름
- 자바에서는 `ConcurrentLinkedQueue`, `Atomic 클래스들`

## Lock-Splitting: 구역별 티켓 예매하는 상황

- 티켓이 100장 있고, 구역이 10구역, 구역마다 좌석은 10석이 있다면
- 단일 락의 경우는 A구역을 예매 중일 때 B구역도 예매가 안 되게 막는 것
- 분할 락의 경우는 누가 A구역을 예매 중이더라도 B, C 등 다른 구역은 예매가 되도록 하는 것
- 락을 작은 단위로 분할했다 보니까 동시에 접근할 수 있는 사람을 최대화할 수 있음
- 자바에서는 `ConcurrentHashMap`

--- 

# 4. Concurrent Collection의 종류

| 분류            | 클래스/인터페이스                                                                                                                     |
|---------------|-------------------------------------------------------------------------------------------------------------------------------|
| Map           | `ConcurrentHashMap`, `ConcurrentSkipListMap`                                                                                  |
| List          | `CopyOnWriteArrayList`                                                                                                        |
| Set           | `ConcurrentSkipListSet`, `CopyOnWriteArraySet`                                                                                |
| Queue/Deque   | `ConcurrentLinkedQueue`, `ConcurrentLinkedDeque`                                                                              |
| BlockingQueue | `ArrayBlockingQueue`, `LinkedBlockingQueue`, `PriorityBlockingQueue`, `DelayQueue`, `SynchronousQueue`, `LinkedTransferQueue` |
| 기타            | `BlockingDeque`, `BlockingQueue`, `ConcurrentNavigableMap` 등                                                                  |


