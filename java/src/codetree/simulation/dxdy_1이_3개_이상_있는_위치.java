package codetree.simulation;

import java.util.Scanner;

public class dxdy_1이_3개_이상_있는_위치 {
    public static final int MAX_N = 100;
    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};
    public static int n;

    public static int[][] board = new int[MAX_N][MAX_N];

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n) && (0 <= y && y < n);
    }

    public static int adjacentCnt(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny, n) && board[nx][ny] == 1) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacentCnt(i, j) >= 3) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
