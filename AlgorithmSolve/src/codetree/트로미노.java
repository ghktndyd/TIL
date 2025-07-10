package codetree;

import java.util.Scanner;

public class 트로미노 {

    public static final int MAX_NUM = 200;

    public static int n;
    public static int m;

    public static int[][] grid = new int[MAX_NUM][MAX_NUM];

    public static int[][][] shapes = new int[][][]{
            {{1, 1, 0},
                    {1, 0, 0},
                    {0, 0, 0}},

            {{1, 1, 0},
                    {0, 1, 0},
                    {0, 0, 0}},

            {{1, 0, 0},
                    {1, 1, 0},
                    {0, 0, 0}},

            {{0, 1, 0},
                    {1, 1, 0},
                    {0, 0, 0}},

            {{1, 1, 1},
                    {0, 0, 0},
                    {0, 0, 0}},

            {{1, 0, 0},
                    {1, 0, 0},
                    {1, 0, 0}},
    };

    public static int getMaxSum(int x, int y) {
        int maxSum = 0;

        for (int i = 0; i < 6; i++) {
            boolean isPossible = true;
            int sum = 0;

            for (int dx = 0; dx < 3; dx++) {
                for (int dy = 0; dy < 3; dy++) {
                    if (shapes[i][dx][dy] == 0) {
                        continue;
                    }

                    if (x + dx >= n || y + dy >= m) {
                        isPossible = false;
                    } else {
                        sum += grid[x + dx][y + dy];
                    }
                }

                if (isPossible) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, getMaxSum(i, j));
            }
        }

        System.out.println(ans);
    }
}
