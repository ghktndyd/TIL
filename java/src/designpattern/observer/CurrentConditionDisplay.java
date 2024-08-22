package designpattern.observer;

public class CurrentConditionDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("현재 온도는 " + temperature);
    }
}
