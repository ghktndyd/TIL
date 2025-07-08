package programmers;

import java.util.Scanner;

public class 최장부분수열 {
    public static final int MAX_N = 1000;

    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] * arr[i - 1] > 0)
                cnt++;
            else
                cnt = 1;

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}
