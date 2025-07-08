package algorithm;

import java.util.Scanner;

public class SimulationExam02 {
    public static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for (int i = 1; i < m; i++)
            totalDays += days[i];

        // m월의 경우에는 정확히 d일까지
        totalDays += d;

        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.println(numOfDays(m2, d2) - numOfDays(m1, d1) + 1);
    }
}