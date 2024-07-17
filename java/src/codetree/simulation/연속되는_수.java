package codetree.simulation;

import java.util.Scanner;

public class 연속되는_수 {

    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0, cnt = 0;
        for (int i = 0; i < N; i++) {
            if (i >= 1 && arr[i] * arr[i - 1] > 0) {
                cnt++;
            } else {
                cnt = 1;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}
