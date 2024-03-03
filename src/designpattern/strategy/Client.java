package designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext(new StrategyGun());
        rambo.runContext(new StrategySword());
    }
}
