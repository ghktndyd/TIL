package baekjoon;

import java.util.Scanner;

public class P11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 초기화

        int n = sc.nextInt(); // n 값을 읽음
        int m = sc.nextInt(); // m 값을 읽음

        int[][] arr = new int[n + 1][n + 1]; // 입력된 값을 저장할 2차원 배열
        int[][] prefixSum = new int[n + 1][n + 1]; // 구간합을 저장할 2차원 배열

        // 배열 입력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt(); // 각 값을 배열에 저장
            }
        }

        // 2차원 prefix sum 배열 계산
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1]; // prefix sum 계산
            }
        }

        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 StringBuilder 초기화
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt(); // x1 값을 읽음
            int y1 = sc.nextInt(); // y1 값을 읽음
            int x2 = sc.nextInt(); // x2 값을 읽음
            int y2 = sc.nextInt(); // y2 값을 읽음

            int result = prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1]; // 구간합 계산
            sb.append(result).append('\n'); // 결과를 StringBuilder에 추가
        }

        System.out.print(sb); // 최종 결과 출력

        sc.close(); // Scanner 닫기
    }
}