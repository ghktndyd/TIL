package codetree.simulation;

import java.util.Scanner;

public class 잔해물을_덮기_위한_사각형의_최소_넓이 {

    public static int RECTANGLE_COUNT = 2;
    public static int OFFSET = 1000;
    public static int MAX_R = 2000;

    public static int[] x1 = new int[RECTANGLE_COUNT];
    public static int[] y1 = new int[RECTANGLE_COUNT];
    public static int[] x2 = new int[RECTANGLE_COUNT];
    public static int[] y2 = new int[RECTANGLE_COUNT];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < RECTANGLE_COUNT; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < RECTANGLE_COUNT; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int minX = MAX_R;
        int maxX = 0;
        int minY = MAX_R;
        int maxY = 0;

        boolean firstRectangleExist = false;

        for (int x = 0; x <= MAX_R; x++) {
            for (int y = 0; y <= MAX_R; y++) {
                if (checked[x][y] == 1) {
                    firstRectangleExist = true; // 첫 번째 직사각형의 잔해물이 존재
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        int area = 0;

        if (!firstRectangleExist) {
            System.out.print(area);
        } else {
            area = (maxX - minX + 1) * (maxY - minY + 1);
            System.out.println(area);
        }
    }
}
