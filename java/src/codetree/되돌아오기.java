package codetree;

import java.util.Scanner;

public class 되돌아오기 {
    public static final int DIR_NUM = 4;

    public static int n, x, y;

    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static int ans = -1;

    public static int elapsedTime;

    public static boolean move(int dir, int dist) {
        while (dist-- > 0) {
            x += dx[dir];
            y += dy[dir];
            elapsedTime++;
            if (x == 0 && y == 0) {
                ans = elapsedTime;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n-- > 0) {
            char cDir = sc.next().charAt(0);
            int dist = sc.nextInt();

            int dir;
            if (cDir == 'E')
                dir = 0;
            else if (cDir == 'W')
                dir = 1;
            else if (cDir == 'S')
                dir = 2;
            else
                dir = 3;

            boolean done = move(dir, dist);

            if (done)
                break;
        }

        System.out.print(ans);
    }
}