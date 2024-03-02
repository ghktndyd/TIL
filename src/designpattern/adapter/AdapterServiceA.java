package designpattern.adapter;

public class AdapterServiceA {
    ServiceA serviceA = new ServiceA();

    void runService() {
        serviceA.runServiceA();
    }
}
