package codetree;

import java.util.Scanner;

public class 최고의_13_위치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int maxCoin = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                maxCoin = Math.max(maxCoin, board[i][j] + board[i][j + 1] + board[i][j + 2]);
            }
        }

        System.out.println(maxCoin);
    }
}
