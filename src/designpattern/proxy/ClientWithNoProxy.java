package designpattern.proxy;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        Service service = new Service();

        System.out.println(service.runSomething());
        // 프록시를 이용 안한 예시
    }
}
