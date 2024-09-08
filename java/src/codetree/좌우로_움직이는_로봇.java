package codetree;

import java.util.Scanner;

public class 좌우로_움직이는_로봇 {
    public static final int MAX_TIME = 1000000;
    public static final int[] robotA = new int[MAX_TIME + 1];
    public static final int[] robotB = new int[MAX_TIME + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'R') {
                    robotA[timeA] = robotA[timeA - 1] + 1;
                } else {
                    robotA[timeA] = robotA[timeA - 1] - 1;
                }
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'R') {
                    robotB[timeB] = robotB[timeB - 1] + 1;
                } else {
                    robotB[timeB] = robotB[timeB - 1] - 1;
                }
                timeB++;
            }
        }

        if (timeA > timeB) {
            for (int i = timeB; i < timeA; i++) {
                robotB[i] = robotB[i - 1];
            }
        } else if (timeA < timeB) {
            for (int i = timeA; i < timeB; i++) {
                robotA[i] = robotA[i - 1];
            }
        }

        int count = 0;
        int timeMax;
        if (timeA > timeB) {
            timeMax = timeA;
        } else {
            timeMax = timeB;
        }

        for (int i = 1; i < timeMax; i++) {
            if (robotA[i] == robotB[i] && robotA[i - 1] != robotB[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}