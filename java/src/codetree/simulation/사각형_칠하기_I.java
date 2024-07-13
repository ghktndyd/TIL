package codetree.simulation;

import java.util.Scanner;

public class 사각형_칠하기_I {
    static final int MAX_N = 10;
    static final int MAX_R = 200;
    static final int OFFSET = 100;

    static int N;
    static int[] x1 = new int[MAX_N];
    static int[] y1 = new int[MAX_N];
    static int[] x2 = new int[MAX_N];
    static int[] y2 = new int[MAX_N];

    static int[][] checked = new int[MAX_R + 1][MAX_R + 1];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        // 사각형 채우기
        // 격자이므로 x2, y2를 범위 내에서 제외해야 함
        for (int i = 0; i < N; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y]++;
                }
            }
        }

        int totalArea = 0;

        for (int x = 0; x <= MAX_R; x++) {
            for (int y = 0; y <= MAX_R; y++) {
                if (checked[x][y] > 0) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);
    }
}
