package designpattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherStation.addObserver(currentConditionDisplay);

        weatherStation.setTemperature(30);
        weatherStation.setTemperature(35);
    }
}
