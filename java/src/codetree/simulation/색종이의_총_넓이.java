package codetree.simulation;

import java.util.Scanner;

public class 색종이의_총_넓이 {

    public static int N;
    public static int MAX_N = 100;
    public static int OFFSET = 100;
    public static int MAX_R = 200;

    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 색종이의 개수

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = x1[i] + 8;
            y2[i] = y1[i] + 8;
        }

        for (int i = 0; i < N; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y]++;
                }
            }
        }

        int totalArea = 0;

        for (int x = 0; x < MAX_R; x++) {
            for (int y = 0; y < MAX_R; y++) {
                if (checked[x][y] >= 1) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);
    }
}
