package programmers;

import java.util.Stack;

public class P12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> integerStack = new Stack<>();

        for (int num : arr) {
            if (integerStack.empty() || !integerStack.peek().equals(num)) {
                integerStack.push(num);
            }
        }

        return integerStack.stream()
                .mapToInt(num -> num)
                .toArray();
    }
}
