package algorithm;

import java.util.*;

public class SimulationExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int totalDaysFromStartOfYear = getTotalDays(m2, d2) - getTotalDays(m1, d1) + 1;

        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String dayOfWeek = daysOfWeek[(totalDaysFromStartOfYear % 7 + 6) % 7];

        System.out.println(dayOfWeek);
    }

    private static int getTotalDays(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;

        return totalDays;
    }
}