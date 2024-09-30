package codetree;

import java.util.Scanner;

public class 체크판위에서_2 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int R = SCANNER.nextInt();
        int C = SCANNER.nextInt();

        char[][] checkBoard = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                checkBoard[i][j] = SCANNER.next().charAt(0);
            }
        }

        int cnt = 0;

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                for (int k = i + 1; k < R - 1; k++) {
                    for (int l = j + 1; l < C - 1; l++) {
                        if (checkBoard[0][0] != checkBoard[i][j] &&
                                checkBoard[i][j] != checkBoard[k][l] &&
                                checkBoard[k][l] != checkBoard[R - 1][C - 1]) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
