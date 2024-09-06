package codetree;

import java.util.Scanner;

public class T를_초과하는_연속_부분_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || numbers[i] > t && numbers[i - 1] > t) {
                count++;
            } else {
                count = 1;
            }

            ans = Math.max(count, ans);
        }

        System.out.println(ans);
    }
}
