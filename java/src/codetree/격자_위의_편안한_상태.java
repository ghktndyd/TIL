package codetree;

import java.util.Scanner;

public class 격자_위의_편안한_상태 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] DX = {1, 0, -1, 0};
    public static final int[] DY = {0, -1, 0, 1};

    public static int N;
    public static int M;
    public static int[][] board;

    public static void main(String[] args) {
        N = SCANNER.nextInt();
        M = SCANNER.nextInt();
        board = new int[N][N];

        while (M-- > 0) {
            int curX = SCANNER.nextInt() - 1;
            int curY = SCANNER.nextInt() - 1;

            board[curX][curY] = 1;

            System.out.println(isComfortable(curX, curY) ? 1 : 0);
        }
    }

    private static boolean isComfortable(int curX, int curY) {
        int count = 0;

        for (int dirNum = 0; dirNum < 4; dirNum++) {
            int nx = curX + DX[dirNum];
            int ny = curY + DY[dirNum];
            if (inRange(nx, ny) && board[nx][ny] == 1) {
                count++;
            }
        }

        return count == 3;
    }

    private static boolean inRange(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }
}