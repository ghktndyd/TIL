package codetree;

import java.util.Scanner;

public class 일이_3개_이상_있는_위치 {

    public static int n;

    public static final int[] DX = new int[]{1, 0, -1, 0};
    public static final int[] DY = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    int nx = i + DX[k];
                    int ny = j + DY[k];

                    if (inRange(nx, ny) && board[nx][ny] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) {
                    ans++;
                }

                cnt = 0;
            }
        }

        System.out.println(ans);
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n) && (0 <= y && y < n);
    }
}
