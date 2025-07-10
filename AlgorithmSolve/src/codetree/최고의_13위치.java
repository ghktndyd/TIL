package codetree;

import java.util.Scanner;

public class 최고의_13위치 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int n = SCANNER.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = SCANNER.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                max = Math.max(max, grid[i][j] + grid[i][j + 1] + grid[i][j + 2]);
            }
        }

        System.out.println(max);
    }
}
