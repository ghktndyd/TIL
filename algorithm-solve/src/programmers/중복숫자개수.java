package programmers;

import java.util.Arrays;

public class 중복숫자개수 {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 1, 2, 3, 4, 5}, 1);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(num -> num == n)
                .count();
    }
}
