package programmers;

import java.util.Arrays;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] array = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        if (array.length == 0) {
            return new int[]{-1};
        }

        return array;
    }
}
