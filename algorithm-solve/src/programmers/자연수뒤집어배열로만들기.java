package programmers;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        int[] result = new 자연수뒤집어배열로만들기().solution(12345);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String reverseString = sb.reverse().toString();

        return Arrays.stream(reverseString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
