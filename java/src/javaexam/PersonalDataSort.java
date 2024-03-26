package javaexam;

import java.util.*;

public class PersonalDataSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] person = new Person[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person, (a, b) -> a.name.compareTo(b.name));

        Person.print("name", person);
        System.out.println();

        Arrays.sort(person, (a, b) -> b.height - a.height);
        Person.print("height", person);
    }
}

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void print(String value, Person[] person) {
        System.out.println(value);
        for (int i = 0; i < person.length; i++) {
            System.out.printf("%s %d %.1f\n", person[i].name, person[i].height, person[i].weight);
        }
    }
}