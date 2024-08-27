package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 아름다운_수열_2 {
    public static int N, M; // 수열 A와 B의 길이

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] A = new int[N];

        M = sc.nextInt();
        int[] B = new int[M];
        int[] temp = new int[M];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(B);

        int count = 0;
        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j < M; j++) {
                temp[j] = A[i + j];
            }

            Arrays.sort(temp, 0, M);

            boolean isSame = true;
            for (int j = 0; j < M; j++) {
                if (temp[j] != B[j]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                count++;
            }
        }

        System.out.println(count);
    }
}
