package codetree;

import java.util.Scanner;

public class 인접하지_않은_2개의_숫자 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static int MAX = Integer.MIN_VALUE;

    public static int n;

    public static void main(String[] args) {
        n = SCANNER.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = SCANNER.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i + 1; j--) {
                MAX = Math.max(MAX, numbers[i] + numbers[j]);
            }
        }

        System.out.println(MAX);
    }
}
