package programmers;

import java.util.Arrays;

public class P12935 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        int finalMin = min;

        return Arrays.stream(arr)
                .filter(num -> num != finalMin)
                .toArray();
    }
}
