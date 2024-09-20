package codetree;

import java.util.Scanner;

public class 선두를_지켜라_3 {

    public static final int MAX_R = 1_000_000;
    public static final int[] A = new int[MAX_R + 1];
    public static final int[] B = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int aPosition = 1;
        for (int i = 0; i < N; i++) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            while (t-- > 0) {
                A[aPosition] = A[aPosition - 1] + v;
                aPosition++;
            }
        }

        int bPosition = 1;
        for (int i = 0; i < M; i++) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            while (t-- > 0) {
                B[bPosition] = B[bPosition - 1] + v;
                bPosition++;
            }
        }

        int lastLead = 0;
        int changeCount = 0;

        for (int time = 1; time < Math.min(aPosition, bPosition); time++) {
            int currentLead;

            if (A[time] > B[time]) {
                currentLead = 1;  // A가 선두
            } else if (A[time] < B[time]) {
                currentLead = 2;  // B가 선두
            } else {
                currentLead = 0;  // 동시 선두
            }

            if (currentLead != lastLead) {
                changeCount++;
                lastLead = currentLead;
            }
        }

        System.out.println(changeCount);
    }
}
