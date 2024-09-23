package codetree;

import java.util.Scanner;

public class 빙빙_돌며_사각형_채우기 {

    public static int row;
    public static int col;

    public static int currentRow = 0;
    public static int currentCol = 0;
    public static int currentDir = 0;

    public static final int[] DX = {0, 1, 0, -1};
    public static final int[] DY = {1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < row) && (0 <= y && y < col);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        row = scanner.nextInt();
        col = scanner.nextInt();

        int[][] board = new int[row][col];

        board[currentRow][currentCol] = 1;

        for (int i = 2; i <= row * col; i++) {
            int nx = currentRow + DX[currentDir];
            int ny = currentCol + DY[currentDir];

            if (!inRange(nx, ny) || board[nx][ny] != 0) {
                currentDir = (currentDir + 1) % 4;
            }

            currentRow = currentRow + DX[currentDir];
            currentCol = currentCol + DY[currentDir];

            board[currentRow][currentCol] = i;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
