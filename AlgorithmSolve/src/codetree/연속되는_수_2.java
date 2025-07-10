package codetree;

import java.util.Scanner;

public class 연속되는_수_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 || numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
