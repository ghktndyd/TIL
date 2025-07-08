package designpattern.templatemethod;

public class Dog extends Animal {

    // 추상 메서드 구현
    @Override
    void play() {
        System.out.println("멍멍!!");
    }

    // 훅 메서드 재구현
    @Override
    void runSomething() {
        System.out.println("멍멍멍멍멍멍 재밌어");
    }
}
