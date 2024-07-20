package codetree.simulation;

import java.util.Scanner;

public class 좌우로_움직이는_로봇 {

    public static final int MAX_TIME = 1000000;
    public static final int[] robotA = new int[MAX_TIME + 1];
    public static final int[] robotB = new int[MAX_TIME + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // A의 명령 횟수
        int m = sc.nextInt(); // B의 명령 횟수

        int timeA = 1; // 로봇 A가 총 몇초 움직이는지 기록하는 변수
        for (int i = 0; i < n; i++) { // 질의만큼 이동하도록 for문
            int t = sc.nextInt(); // 몇 초 이동할지를 저장하는 변수
            char d = sc.next().charAt(0); // 어느 방향으로 이동할지를 저장하는 변수

            while (t-- > 0) { // 초마다 움직이니까 0초까지 움직이도록 설정
                if (d == 'R') { // 우측 방향이면 로봇이 현재 시간에 움직인 방향은 이전 로봇 위치에 +1
                    robotA[timeA] = robotA[timeA - 1] + 1;
                } else { // 좌측 방향이면 로봇이 현재 시간에 움직인 방향은 이전 로봇 위치에 -1
                    robotA[timeA] = robotA[timeA - 1] - 1;
                }
                timeA++; // 총 시간 +1
            }
        }

        // 위와 동일
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

        // 만약 A 로봇이 더 많이 움직였다면 A로봇의 움직인 시간만큼 B로봇의 움직인 시간을 채우기
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
