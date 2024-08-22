package codetree;

import java.util.Scanner;

public class 구간_중_최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += array[j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
