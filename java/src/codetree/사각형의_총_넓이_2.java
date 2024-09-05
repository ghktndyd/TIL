package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 사각형의_총_넓이_2 {
    public static final int MAX_N = 100;
    public static final int OFFSET = 100;
    public static final int MAX_R = MAX_N + OFFSET;

    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    grid[j][k] = 1;
                }
            }
        }

        int sum = (int) Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(v -> v != 0)
                .count();

        System.out.println(sum);
    }
}