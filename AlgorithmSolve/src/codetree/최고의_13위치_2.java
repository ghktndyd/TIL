package codetree;

import java.util.Scanner;

public class 최고의_13위치_2 {

    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N - 2; l++) {
                        if (i == k && (l <= j + 2 && l + 2 >= j)) {
                            continue;
                        }
                        maxCount = Math.max(maxCount, grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[k][l] + grid[k][l + 1] + grid[k][l + 2]);
                    }
                }
            }
        }

        System.out.println(maxCount);
    }
}
