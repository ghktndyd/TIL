package programmers;

import java.util.Arrays;

public class P12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int total = 0;
        int count = 0;
        for (int j : d) {
            total += j;

            if (total >= budget) {
                break;
            }

            count++;
        }

        return count;
    }
}
