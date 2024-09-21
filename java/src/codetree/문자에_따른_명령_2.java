package codetree;

import java.util.Scanner;

public class 문자에_따른_명령_2 {

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] orders = sc.next().split("");

        int dir = 3;
        int x = 0;
        int y = 0;

        for (String order : orders) {
            if (order.equals("L")) {
                dir = (dir + 3) % 4;
            } else if (order.equals("R")) {
                dir = (dir + 1) % 4;
            } else {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x + " " + y);
    }
}