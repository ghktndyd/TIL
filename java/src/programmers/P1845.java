package programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class P1845 {
    public int solution(int[] nums) {
        Set<Integer> numberSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        if (numberSet.size() == nums.length / 2) {
            return numberSet.size();
        }

        return nums.length / 2;
    }
}
