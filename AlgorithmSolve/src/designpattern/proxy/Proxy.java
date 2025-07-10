package designpattern.proxy;

public class Proxy implements IService {
    IService iService;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어만 합니다. 즉 반환 결과 그대로 전달");

        iService = new Service();
        return iService.runSomething();
    }

}
