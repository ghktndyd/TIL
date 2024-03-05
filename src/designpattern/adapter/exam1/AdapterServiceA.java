package designpattern.adapter.exam1;

public class AdapterServiceA {
    ServiceA serviceA = new ServiceA();

    void runService() {
        serviceA.runServiceA();
    }
}
