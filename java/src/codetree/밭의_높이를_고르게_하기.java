package codetree;

import java.util.Scanner;

public class 밭의_높이를_고르게_하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int t = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n - t; i++) {
            int cost = 0;

            for (int j = i; j < i + t; j++) {
                if (arr[j] < h) {
                    cost += (h - arr[j]);
                }
                if (arr[j] > h) {
                    cost += (arr[j] - h);
                }
            }

            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);
    }
}
