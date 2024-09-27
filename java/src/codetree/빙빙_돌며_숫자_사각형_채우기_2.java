package codetree;

import java.util.Scanner;

public class 빙빙_돌며_숫자_사각형_채우기_2 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] DX = {1, 0, -1, 0};
    public static final int[] DY = {0, 1, 0, -1};

    public static int start = 1;
    public static int n;
    public static int m;
    public static int x;
    public static int y;
    public static int currentDir = 0;

    public static void main(String[] args) {
        n = SCANNER.nextInt();
        m = SCANNER.nextInt();
        int[][] board = new int[n][m];

        board[x][y] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nx = x + DX[currentDir];
            int ny = y + DY[currentDir];

            if (!inRange(nx, ny) || board[nx][ny] != 0) {
                currentDir = (currentDir + 1) % 4;
            }

            x += DX[currentDir];
            y += DY[currentDir];

            board[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= m && y < m);
    }
}
