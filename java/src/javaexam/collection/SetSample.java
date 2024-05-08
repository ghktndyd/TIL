package javaexam.collection;

import java.util.HashSet;
import java.util.List;

public class SetSample {
    public static void main(String[] args) {
        SetSample setSample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "Tico", "SM5",
                "BMW", "Mustang", "BMW", "Benz",
                "SM7", "Grandeure", "Lexus", "Carnibal"
        };

        int carKinds = setSample.getCarKinds(cars);
        System.out.println("carKinds = " + carKinds);
    }

    public int getCarKinds(String[] cars) {
        HashSet<String> distinctCars = new HashSet<>(List.of(cars));
        printCarSet(distinctCars);
        return distinctCars.size();
    }

    private void printCarSet(HashSet<String> distinctCars) {
        for (String distinctCar : distinctCars) {
            System.out.println("distinctCar = " + distinctCar);
        }
    }
}
