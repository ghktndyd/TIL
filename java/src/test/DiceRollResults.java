package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiceRollResults {

    private final Map<Integer, Integer> map = new LinkedHashMap<>();

    public DiceRollResults(int maxDiceNumber) {
        for (int i = 1; i <= maxDiceNumber; i++) {
            map.put(i, 0);
        }
    }

    public void add(int rollResult) {
        int updated = map.get(rollResult) + 1;
        map.replace(rollResult, updated);
    }

    public int get(int num) {
        return map.get(num);
    }

    public void count(int rollResult) {
        int updated = map.get(rollResult) + 1;
        map.replace(rollResult, updated);
    }
}
