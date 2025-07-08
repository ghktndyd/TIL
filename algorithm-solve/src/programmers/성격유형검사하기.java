package programmers;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    public static void main(String[] args) {
        성격유형검사하기 성격유형검사하기 = new 성격유형검사하기();

        String[] strings = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String solution = 성격유형검사하기.solution(strings, choices);
        System.out.println(solution);
    }

    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        Characteristic[] characteristics = {
                new Characteristic('R', 'T'),
                new Characteristic('C', 'F'),
                new Characteristic('J', 'M'),
                new Characteristic('A', 'N')
        };

        for (int i = 0; i < survey.length; i++) {
            int value = choices[i];
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);

            if (value < 4) {
                map.put(disagree, map.getOrDefault(disagree, 0) + 4 - value);
            } else if (value > 4) {
                map.put(agree, map.getOrDefault(agree, 0) + value - 4);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Characteristic characteristic : characteristics) {
            char first = characteristic.firstCategory;
            char second = characteristic.secondCategory;
            if (map.getOrDefault(first, 0) >= map.getOrDefault(second, 0)) {
                result.append(first);
            } else {
                result.append(second);
            }
        }

        return result.toString();
    }

    static class Characteristic {
        char firstCategory;
        char secondCategory;

        public Characteristic(char firstCategory, char secondCategory) {
            this.firstCategory = firstCategory;
            this.secondCategory = secondCategory;
        }
    }
}