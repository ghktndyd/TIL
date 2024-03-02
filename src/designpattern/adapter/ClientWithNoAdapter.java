package designpattern.adapter;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.runServiceA();
        serviceB.runServiceB();

        // 어댑터 패턴이 없으면 같은 기능을 하는 메서드여도 다른 이름으로 해야 한다.
    }
}
