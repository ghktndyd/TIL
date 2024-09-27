package codetree;

import java.util.Scanner;

public class 빙빙_돌며_알파벳_사각형_채우기 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] D_ROW = {0, 1, 0, -1};
    public static final int[] D_COL = {1, 0, -1, 0};

    public static int row;
    public static int col;
    public static int n;
    public static int m;
    public static int curDir;

    public static void main(String[] args) {
        n = SCANNER.nextInt();
        m = SCANNER.nextInt();
        char[][] board = new char[n][m];

        board[row][col] = 'A';
        int curAlphabet = 'B';

        for (int i = 2; i <= n * m; i++) {
            int nRow = row + D_ROW[curDir];
            int nCol = col + D_COL[curDir];

            if (!inRange(nRow, nCol) || board[nRow][nCol] != '\u0000') {
                curDir = (curDir + 1) % 4;
            }

            row += D_ROW[curDir];
            col += D_COL[curDir];

            if (curAlphabet > 'Z') {
                curAlphabet = 'A';
            }

            board[row][col] = (char) curAlphabet;
            curAlphabet++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
