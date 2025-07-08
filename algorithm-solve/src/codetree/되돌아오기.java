package codetree;

import java.util.Scanner;

public class 되돌아오기 {

    public static final int[] DX = {1, 0, -1, 0};
    public static final int[] DY = {0, -1, 0, 1};

    public static int answer = -1;
    public static int X;
    public static int Y;
    public static int useSecond;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            char direction = scanner.next().charAt(0);
            int distance = scanner.nextInt();

            boolean current = move(direction, distance);

            if (current) {
                break;
            }
        }

        System.out.println(answer);
    }

    private static boolean move(char direction, int distance) {
        int dir = getDir(direction);

        while (0 < distance--) {
            X += DX[dir];
            Y += DY[dir];

            useSecond++;

            if (X == 0 && Y == 0) {
                answer = useSecond;
                return true;
            }
        }

        return false;
    }

    private static int getDir(char direction) {
        if (direction == 'E') {
            return 0;
        }
        if (direction == 'S') {
            return 1;
        }
        if (direction == 'W') {
            return 2;
        }
        if (direction == 'N') {
            return 3;
        }

        throw new IllegalArgumentException();
    }
}