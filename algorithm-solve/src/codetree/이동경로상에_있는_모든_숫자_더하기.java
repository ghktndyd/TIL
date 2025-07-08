package codetree;

import java.util.Scanner;

public class 이동경로상에_있는_모든_숫자_더하기 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] dx = {-1, 0, 1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    public static int n;
    public static int t;
    public static int dir;

    public static void main(String[] args) {
        n = SCANNER.nextInt();
        t = SCANNER.nextInt();

        int[][] matrix = new int[n][n];
        char[] orders = SCANNER.next().toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = SCANNER.nextInt();
            }
        }

        int x = n / 2;
        int y = n / 2;
        int sum = matrix[x][y];

        for (char order : orders) {
            if ('F' == order) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (!inRange(nx, ny)) {
                    continue;
                }

                x = nx;
                y = ny;

                sum += matrix[x][y];
            } else if ('R' == order) {
                dir = (dir + 1) % 4;
            } else {
                dir = (dir + 3) % 4;
            }
        }

        System.out.println(sum);
    }

    private static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}
