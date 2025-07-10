package codetree;

import java.util.Scanner;

public class 특정_수와_근접한_합 {
    public static int difference = Integer.MAX_VALUE;
    public static int total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 숫자의 개수
        int S = sc.nextInt(); // 목표 합

        int[] arr = new int[N]; // 입력받은 숫자의 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int currentDiff = Math.abs(S - (total - arr[j] - arr[k]));

                    if (currentDiff < difference) {
                        difference = currentDiff;
                    }
                }
            }
        }

        System.out.println(difference);
    }
}
