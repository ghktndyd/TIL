package codetree;

import java.util.Scanner;

public class 두_숫자의_차의_최솟값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            min = Math.min(abs, min);
        }

        System.out.println(min);
    }
}
