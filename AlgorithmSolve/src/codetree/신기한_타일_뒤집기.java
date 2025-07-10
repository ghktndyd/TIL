package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 신기한_타일_뒤집기 {
    public static final int MAX_R = 100000;
    public static int[] tiles = new int[MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int current = tiles.length / 2;  // 초기 위치를 중간으로 설정 (한번만 초기화)

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("L")) {
                for (int j = 0; j < count; j++) {
                    tiles[current] = 1;  // 타일을 흰색으로 설정
                    current--;
                }
                current++;
            } else {
                for (int j = 0; j < count; j++) {
                    tiles[current] = 2;
                    current++;
                }
                current--;
            }
        }

        long whiteTile = Arrays.stream(tiles)
                .filter(c -> c == 1)
                .count();

        long blackTile = Arrays.stream(tiles)
                .filter(c -> c == 2)
                .count();

        System.out.println(whiteTile + " " + blackTile);
    }
}