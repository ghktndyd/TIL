package designpattern.decorator;

public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());

        // 메서드 호출 값 + 중간에 장식 추가
    }
}
