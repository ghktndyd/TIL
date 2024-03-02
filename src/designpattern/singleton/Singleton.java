package designpattern.singleton;

public class Singleton {

    // 유일한 단일 객체를 참조할 정적 참조 변수
    static Singleton singletonObject;

    // new를 실행할 수 없도록 기본 생성자에 private 접근 제어자를 지정
    private Singleton() {}

    // 유일한 단일 객체를 반환하는 정적 메서드
    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
