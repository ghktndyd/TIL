package codetree;

import java.util.Scanner;

public class 최대로_겹치는_구간 {
    public static final int OFFSET = 100;
    public static final int MAX_N = 100; // 최대 명령 수
    public static final int MAX_R = 200; // 최대 범위 + OFFSET

    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;

            for (int j = x1[i]; j < x2[i]; j++) {
                checked[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i <= MAX_R; i++) {
            max = Math.max(max, checked[i]);
        }

        System.out.println(max);
    }
}
