package test;

import java.util.Random;

public class RandomGenerator implements NumberGenerator {

    Random random = new Random();

    @Override
    public int generate(int maxDiceNumber) {
        return random.nextInt(maxDiceNumber) + 1;
    }
}
