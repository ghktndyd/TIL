package codetree;

import java.util.Scanner;

public class 구간_중_최대_합 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += numbers[j];
            }

            ans = Math.max(ans, temp);
        }

        System.out.println(ans);
    }
}
