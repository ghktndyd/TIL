package codetree;

import java.util.Scanner;

public class 최고의_33_위치 {

    public static int findCoin(int[][] board,
                               int rowStart, int colStart,
                               int rowEnd, int colEnd) {
        int coinCount = 0;

        for (int row = rowStart; row <= rowEnd; row++) {
            for (int col = colStart; col <= colEnd; col++) {
                coinCount += board[row][col];
            }
        }

        return coinCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int maxCoinCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + 2 >= N || j + 2 >= N) {
                    continue;
                }

                int coinCount = findCoin(board, i, j, i + 2, j + 2);
                maxCoinCount = Math.max(coinCount, maxCoinCount);
            }
        }

        System.out.print(maxCoinCount);
    }
}
