package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 겹치지_않는_사각형의_넓이 {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;
    public static final int RECTANGLE_COUNT = 3;

    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= RECTANGLE_COUNT; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    grid[j][k] = i;
                }
            }
        }

        int sum = (int) Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(v -> v != 0)
                .filter(v -> v != 3)
                .count();

        System.out.println(sum);
    }
}
