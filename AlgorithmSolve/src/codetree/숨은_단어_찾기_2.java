package codetree;

import java.util.Scanner;

public class 숨은_단어_찾기_2 {

    public static int N;
    public static int M;

    // 우, 상, 우상, 우하, 좌, 좌상, 좌하, 하
    public static final int[] DX = {1, 0, 1, 1, -1, -1, -1, 0};
    public static final int[] DY = {0, -1, -1, 1, 0, -1, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            String string = sc.nextLine();
            grid[i] = string.toCharArray();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'L') {
                    for (int direction = 0; direction < 8; direction++) {
                        if (checkForLEE(grid, i, j, direction)) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static boolean checkForLEE(char[][] grid, int x, int y, int direction) {
        for (int i = 1; i < 3; i++) {
            int nx = x + DX[direction] * i;
            int ny = y + DY[direction] * i;

            if (!inRange(nx, ny)) {
                return false;
            }

            if (grid[nx][ny] != 'E') {
                return false;
            }
        }

        return true;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
