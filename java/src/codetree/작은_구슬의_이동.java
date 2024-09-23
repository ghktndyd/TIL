package codetree;

import java.util.Scanner;

public class 작은_구슬의_이동 {

    public static int n;
    public static int t;

    public static final int[] DX = {0, 1, -1, 0};
    public static final int[] DY = {1, 0, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        t = scanner.nextInt();

        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        int direction = getDir(scanner.next().charAt(0));

        while (t-- > 0) {
            int nx = row + DX[direction];
            int ny = col + DY[direction];

            if (!inRange(nx, ny)) {
                direction = 3 - direction;
                continue;
            }

            row = row + DX[direction];
            col = col + DY[direction];
        }

        System.out.printf("%d %d", row + 1, col + 1);
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n) && (0 <= y && y < n);
    }

    public static int getDir(char direction) {
        if (direction == 'R') {
            return 0;
        }
        if (direction == 'D') {
            return 1;
        }
        if (direction == 'U') {
            return 2;
        }
        if (direction == 'L') {
            return 3;
        }

        throw new IllegalArgumentException();
    }
}
