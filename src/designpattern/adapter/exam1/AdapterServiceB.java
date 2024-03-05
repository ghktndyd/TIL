package designpattern.adapter.exam1;

public class AdapterServiceB {
    ServiceB serviceB = new ServiceB();

    void runService() {
        serviceB.runServiceB();
    }
}
