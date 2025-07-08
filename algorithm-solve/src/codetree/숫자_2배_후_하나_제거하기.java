package codetree;

import java.util.Scanner;

public class 숫자_2배_후_하나_제거하기 {
    public static int n;

    public static void main(String[] args) {
        int minDiff = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i] *= 2;

            for (int j = 0; j < n; j++) {
                int[] remainingArr = new int[n - 1];
                int cnt = 0;

                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        remainingArr[cnt++] = arr[k];
                    }
                }

                int sumDiff = 0;
                for (int k = 0; k < n - 2; k++) {
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }

                minDiff = Math.min(minDiff, sumDiff);
            }

            arr[i] /= 2;
        }

        System.out.println(minDiff);
    }
}
