package codetree;

import java.util.Scanner;

public class 야바위 {
    public static final int MAX_N = 100;
    public static final int MAX_NUM = 3;

    public static int n;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];
    public static int[] c = new int[MAX_N];
    public static int[] yabawi = new int[MAX_NUM + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int maxScore = 0;

        // 시작 위치를 전부 가정해 봅니다.
        // 그 중 최대 점수를 계산합니다.
        for (int i = 1; i <= 3; i++) {
            // 종이컵을 전부 비워줍니다.
            yabawi[1] = yabawi[2] = yabawi[3] = 0;

            // i번째 종이컵에 처음 조약돌을 넣고 시작합니다.
            yabawi[i] = 1;

            int score = 0;
            // 게임을 순서대로 진행합니다.
            for (int j = 0; j < n; j++) {
                // 두 종이컵을 교환합니다.
                int temp = yabawi[a[j]];
                yabawi[a[j]] = yabawi[b[j]];
                yabawi[b[j]] = temp;

                // 교환 이후 c[j]번에 돌이 있다면 점수를 얻게 됩니다.
                if (yabawi[c[j]] == 1) {
                    score++;
                }
            }

            // 최대 점수를 갱신합니다.
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}
