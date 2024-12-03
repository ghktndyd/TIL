package codetree;

import java.util.Scanner;

public class 개발팀의_능력 {

    private static final int INF = Integer.MAX_VALUE;
    private static final int N = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int minDiff = INF;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            minDiff = Math.min(minDiff, sumDiff(arr, i, j, k, l));
                        }
                    }
                }
            }
        }

        if (minDiff == INF) {
            System.out.println(-1);
        } else {
            System.out.println(minDiff);
        }
    }

    private static int sumDiff(int[] arr, int i, int j, int k, int l) {
        int sum1 = arr[i] + arr[j];
        int sum2 = arr[k] + arr[l];
        int sum3 = 0;

        for (int val : arr) {
            sum3 += val;
        }

        sum3 -= (sum1 + sum2);

        if (sum1 != sum2 && sum1 != sum3 && sum2 != sum3) {
            return Math.max(Math.max(sum1, sum2), sum3) - Math.min(Math.min(sum1, sum2), sum3);
        }

        return INF;
    }
}