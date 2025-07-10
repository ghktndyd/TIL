package codetree.recursion;

import java.util.Scanner;

public class 재귀함수를_이용한_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxNumber(arr, n - 1));
    }

    private static int findMaxNumber(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return Math.max(arr[n], findMaxNumber(arr, n - 1));
    }
}
