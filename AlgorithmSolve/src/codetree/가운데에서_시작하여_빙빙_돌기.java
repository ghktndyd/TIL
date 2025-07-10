package codetree;

import java.util.Scanner;

public class 가운데에서_시작하여_빙빙_돌기 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] D_ROW = {0, -1, 0, 1};
    public static final int[] D_COL = {1, 0, -1, 0};

    public static int n;
    public static int direction;

    public static void main(String[] args) {
        n = SCANNER.nextInt();
        int[][] board = new int[n][n];

        int row = n / 2;
        int col = n / 2;

        int curNum = 1;
        int step = 1;

        board[row][col] = curNum++;

        while (curNum <= n * n) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < step; j++) {
                    row += D_ROW[direction];
                    col += D_COL[direction];

                    if (row >= 0 && row < n && col >= 0 && col < n) {
                        board[row][col] = curNum++;
                    }
                }

                direction = (direction + 1) % 4;
            }
            step++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
