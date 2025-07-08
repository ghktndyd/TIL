package codetree;

import java.util.Scanner;

public class 선두를_지켜라 {
    public static final int MAX_LENGTH = 1_000_000;
    public static int[] A = new int[MAX_LENGTH];
    public static int[] B = new int[MAX_LENGTH];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int aPos = 1;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                A[aPos] = A[aPos - 1] + v;
                aPos++;
            }
        }

        int bPos = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                B[bPos] = B[bPos - 1] + v;
                bPos++;
            }
        }

        int ans = 0;
        int currentLeader = 0;

        for (int i = 1; i < aPos; i++) {
            if (A[i] > B[i]) {
                if (currentLeader == 2) {
                    ans++;
                }
                currentLeader = 1;
            } else if (A[i] < B[i]) {
                if (currentLeader == 1) {
                    ans++;
                }
                currentLeader = 2;
            }
        }

        System.out.println(ans);
    }
}
