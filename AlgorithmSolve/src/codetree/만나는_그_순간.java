package codetree;

import java.util.Scanner;

public class 만나는_그_순간 {

    public static final int MAX_R = 1_000_000;
    public static int[] A = new int[MAX_R];
    public static int[] B = new int[MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int aLocation = 1;
        for (int i = 0; i < N; i++) {
            String direction = sc.next();
            int time = sc.nextInt();

            if (direction.equals("L")) {
                while (time-- > 0) {
                    A[aLocation] = A[aLocation - 1] - 1;
                    aLocation++;
                }
            } else {
                while (time-- > 0) {
                    A[aLocation] = A[aLocation - 1] + 1;
                    aLocation++;
                }
            }
        }

        int bLocation = 1;
        for (int i = 0; i < M; i++) {
            String direction = sc.next();
            int time = sc.nextInt();

            if (direction.equals("L")) {
                while (time-- > 0) {
                    B[bLocation] = B[bLocation - 1] - 1;
                    bLocation++;
                }
            } else {
                while (time-- > 0) {
                    B[bLocation] = B[bLocation - 1] + 1;
                    bLocation++;
                }
            }
        }

        int ans = -1;

        for (int i = 1; i < aLocation; i++) {
            if (A[i] == B[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
