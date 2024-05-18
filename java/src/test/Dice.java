package test;

public class Dice {

    private final DiceRollResults results;
    private final int maxDiceNumber;

    public Dice(int maxDiceNumber) {
        this.results = new DiceRollResults(maxDiceNumber);
        this.maxDiceNumber = maxDiceNumber;
    }

    public DiceRollResults roll(int tryCount, NumberGenerator generator) {
        for (int i = 0; i < tryCount; i++) {
            int rollResult = generator.generate(maxDiceNumber);
            results.count(rollResult);
        }
        return results;
    }
}
