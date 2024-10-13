package codetree;

import java.util.Scanner;

public class 바구니_안의_사탕_2 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int MAX_N = 100;
    public static final int[] CANDY_ARRAY = new int[MAX_N + 1];

    public static int N;
    public static int K;

    public static void main(String[] args) {
        N = SCANNER.nextInt();
        K = SCANNER.nextInt();

        for (int i = 0; i < N; i++) {
            int candyCount = SCANNER.nextInt();
            int candyIndex = SCANNER.nextInt();

            CANDY_ARRAY[candyIndex] += candyCount;
        }

        int maxSum = 0;
        for (int i = 0; i <= MAX_N; i++) {
            int sum = 0;
            for (int j = i - K; j <= i + K; j++) {
                if (j >= 0 && j <= MAX_N) {
                    sum += CANDY_ARRAY[j];
                }
            }

            maxSum = Math.max(maxSum, sum);

        }
        System.out.println(maxSum);
    }
}
