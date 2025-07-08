package codetree;

import java.util.Scanner;

public class 연속되는_수_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 || numbers[i] * numbers[i - 1] > 0) {
                count++;
            } else {
                count = 1;
            }

            ans = Math.max(ans, count);
        }

        System.out.println(ans);
    }
}
