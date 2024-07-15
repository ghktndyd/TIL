package codetree.simulation;

import java.util.Scanner;

public class 계속_중첩되는_사각형 {

    public static int N;
    public static final int MAX_N = 10;
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;

    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        int[][] checked = new int[MAX_R + 1][MAX_R + 1];

        for (int i = 0; i < N; i++) {
            int color = i % 2 == 0 ? 1 : 2; // 1: 빨강, 2: 파랑

            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = color;
                }
            }
        }

        int blueArea = 0;

        for (int x = 0; x <= MAX_R; x++) {
            for (int y = 0; y <= MAX_R; y++) {
                if (checked[x][y] == 2) {
                    blueArea++;
                }
            }
        }

        System.out.println(blueArea);
    }
}
