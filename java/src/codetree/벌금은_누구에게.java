package codetree;

import java.util.Scanner;

public class 벌금은_누구에게 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * N은 학생 수
         * M은 벌칙 수
         * K는 최대 벌칙 수
         */
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] students = new int[N + 1];

        int ans = -1;
        for (int i = 0; i < M; i++) {
            int student = sc.nextInt();
            students[student]++;

            if (students[student] >= K) {
                ans = student;
                break;
            }
        }

        System.out.println(ans);
    }
}
