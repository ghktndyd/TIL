package codetree;

import java.util.Scanner;

public class 오목 {

    public static final int CHECKER_BOARD_SIZE = 19;
    public static final int[][] CHECKER_BOARD = new int[CHECKER_BOARD_SIZE][CHECKER_BOARD_SIZE];
    // (우, 하, 우하, 우상, 좌, 좌하, 좌상, 상)
    public static final int[] DX = {1, 0, 1, 1, -1, -1, -1, 0};
    public static final int[] DY = {0, 1, 1, -1, 0, 1, -1, -1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < CHECKER_BOARD_SIZE; i++) {
            for (int j = 0; j < CHECKER_BOARD_SIZE; j++) {
                CHECKER_BOARD[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < CHECKER_BOARD_SIZE; i++) {
            for (int j = 0; j < CHECKER_BOARD_SIZE; j++) {
                if (CHECKER_BOARD[i][j] != 0) {
                    int currentUser = CHECKER_BOARD[i][j];

                    for (int k = 0; k < 8; k++) {
                        if (checkWin(CHECKER_BOARD, i, j, currentUser, k)) {
                            int middleX = i + DX[k] * 2;
                            int middleY = j + DY[k] * 2;
                            System.out.println(currentUser);
                            System.out.println((middleX + 1) + " " + (middleY + 1));
                            return;
                        }
                    }
                }
            }
        }

        System.out.println(0);
    }

    private static boolean checkWin(int[][] checkerBoard, int x, int y, int user, int direction) {
        int count = 1; // 현위치

        for (int i = 1; i < 5; i++) {
            int nx = x + DX[direction] * i;
            int ny = y + DY[direction] * i;

            if (!inRange(nx, ny) || checkerBoard[nx][ny] != user) {
                return false;
            }

            count++;
        }

        return true;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < CHECKER_BOARD_SIZE && y >= 0 && y < CHECKER_BOARD_SIZE;
    }
}
