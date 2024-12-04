package codetree;

import java.util.Scanner;

public class 운행되고_있는_시간 {

    public static final int MIN_INT = Integer.MIN_VALUE;

    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] startTime = new int[N];
        int[] endTime = new int[N];

        for (int i = 0; i < N; i++) {
            startTime[i] = sc.nextInt();
            endTime[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int[] count = new int[1_000];

            for (int j = 0; j < N; j++) {
                if (j == i) {
                    continue;
                }

                for (int k = startTime[j]; k < endTime[j]; k++) {
                    count[k]++;
                }
            }

            int time = 0;

            for (int j = 1; j < 1_000; j++) {
                if (count[j] > 0) {
                    time++;
                }
            }

            answer = Math.max(answer, time);
        }

        System.out.println(answer);
    }
}
