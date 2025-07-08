package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P68644 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                set.add(sum);
                sum = 0;
            }
        }

        List<Integer> integers = new ArrayList<>(set);
        return integers.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        P68644 p68644 = new P68644();
        System.out.println(Arrays.toString(p68644.solution(new int[]{5, 0, 2, 7})));
    }
}
