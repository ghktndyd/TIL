package designpattern.proxy;

public class ClientWithProxy {
    public static void main(String[] args) {
        // Proxy 사용
        IService iService = new Proxy();

        System.out.println(iService.runSomething());
    }

    // 제어 흐름을 조정하기 위한 목적으로 중간에 대리자를 둔다.
}
