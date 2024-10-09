package codetree;

import java.util.Scanner;

public class GorH3 {

    public static final int MAX_NUM = 10_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[MAX_NUM + 1];

        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            char c = scanner.next().charAt(0);

            if (c == 'G') {
                arr[p] = 1;
            } else {
                arr[p] = 2;
            }
        }

        int maxSum = 0;
        for (int i = 0; i <= MAX_NUM - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
