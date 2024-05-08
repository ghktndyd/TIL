package javaexam.collection;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        Random random = new Random();
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();

        for (int i = 0; i < 10; i++) {
            HashSet<Integer> sixNumber = randomNumberMaker.getSixNumber(random);
            System.out.println(sixNumber);
        }
    }

    public HashSet<Integer> getSixNumber(Random random) {
        HashSet<Integer> numbers = new HashSet<>();

        do {
            numbers.add(random.nextInt(45));
        } while (numbers.size() != 6);

        return numbers;
    }
}
