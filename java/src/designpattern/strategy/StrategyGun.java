package designpattern.strategy;

public class StrategyGun implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("탕탕");
    }
}
