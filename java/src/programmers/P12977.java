package programmers;

import java.util.ArrayList;
import java.util.List;

public class P12977 {
    public int solution(int[] nums) {
        List<Integer> sums = new ArrayList<>();
        int length = nums.length;

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    sums.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int answer = 0;
        for (int sum : sums) {
            if (isPrime(sum)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
