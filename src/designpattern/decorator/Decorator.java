package designpattern.decorator;

public class Decorator implements IService {

    IService iService;

    @Override
    public String runSomething() {
        System.out.println("결과에 장식을 더해서 반환");
        iService = new Service();
        return "데코레이터 " + iService.runSomething();
    }
}
