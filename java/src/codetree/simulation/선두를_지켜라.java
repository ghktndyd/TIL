package codetree.simulation;

import java.util.Scanner;

public class 선두를_지켜라 {

    private static final int MAX_T = 10000000;
    private static int[] posA = new int[MAX_T + 1];
    private static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // A가 매 초 서있는 위치
        int timeA = 1;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        int leader = 0;
        int ans = 0;

        for (int i = 1; i < timeA; i++) {
            if (posA[i] > posB[i]) {
                if (leader == 2) {
                    ans++;
                }
                leader = 1;
            } else if (posA[i] < posB[i]) {
                if (leader == 1) {
                    ans++;
                }
                leader = 2;
            }
        }

        System.out.println(ans);
    }
}
