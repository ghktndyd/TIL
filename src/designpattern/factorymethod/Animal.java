package designpattern.factorymethod;

public abstract class Animal {
    // 팩토리 메서드는 객체를 생성해서 반환하는 메서드를 말한다.
    // 하위 클래스에서 상위 클래스의 팩토리 메서드를 오버라이딩 해서 객체를 반환하게 하는 것을 팩토리 메서드 패턴이라고 한다.

    public abstract AnimalToy getToy();
}
