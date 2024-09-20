package codetree;

import java.util.Scanner;

public class 방향에_맞춰_이동 {

    public static final int[] dx = new int[]{0, 1, 0, -1};
    public static final int[] dy = new int[]{1, 0, -1, 0};

    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            char direction = scanner.next().charAt(0);
            int distance = scanner.nextInt();

            if (direction == 'N') {
                x += dx[0] * distance;
                y += dy[0] * distance;
            } else if (direction == 'E') {
                x += dx[1] * distance;
                y += dy[1] * distance;
            } else if (direction == 'S') {
                x += dx[2] * distance;
                y += dy[2] * distance;
            } else if (direction == 'W') {
                x += dx[3] * distance;
                y += dy[3] * distance;
            }
        }

        System.out.printf("%d %d", x, y);
    }
}
