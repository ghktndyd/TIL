package codetree;

import java.util.Scanner;

public class 되돌아오기_2 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int[] DX = {1, 0, -1, 0};
    public static final int[] DY = {0, -1, 0, 1};

    public static int direction = 3;
    public static int ans = -1;
    public static int X;
    public static int Y;
    public static int elapsedTime;

    public static void main(String[] args) {
        String N = SCANNER.next();

        for (char order : N.toCharArray()) {
            if (order == 'F') {
                X += DX[direction];
                Y += DY[direction];

                elapsedTime++;

                if (X == 0 && Y == 0) {
                    ans = elapsedTime;
                    break;
                }
            } else if (order == 'R') {
                elapsedTime++;
                direction = (direction + 1) % 4;
            } else {
                elapsedTime++;
                direction = (direction - 1 + 4) % 4;
            }
        }

        System.out.println(ans);
    }
}
