package codetree;

import java.util.Scanner;

public class 그_요일은 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String A = sc.next();

        int startDate = countTotalDays(m1, d1);
        int endDate = countTotalDays(m2, d2);
        int currentDay = numOfDay("Mon");

        int answer = 0;
        for (int date = startDate; date <= endDate; date++) {
            if (currentDay == numOfDay(A)) {
                answer++;
            }

            currentDay = (currentDay + 1) % 7;
        }

        System.out.println(answer);
    }

    public static int countTotalDays(int month, int day) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        return totalDays + day;
    }

    public static int numOfDay(String days) {
        switch (days) {
            case "Mon" -> {
                return 0;
            }
            case "Tue" -> {
                return 1;
            }
            case "Wed" -> {
                return 2;
            }
            case "Thu" -> {
                return 3;
            }
            case "Fri" -> {
                return 4;
            }
            case "Sat" -> {
                return 5;
            }
            default -> {
                return 6;
            }
        }
    }
}
