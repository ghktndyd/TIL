package codetree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 코드트리 - 프로그래밍 연습 - 시뮬레이션 II
 */
public class 만나는그순간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] positionsA = new int[1000001];
        int[] positionsB = new int[1000001];

        int positionA = 0;
        int timeA = 0;

        for (int i = 0; i < N; i++) {
            String[] order = sc.nextLine().split(" ");
            String direction = order[0];
            int moveTime = Integer.parseInt(order[1]);

            for (int t = 0; t < moveTime; t++) {
                if (direction.equals("L")) {
                    positionA--;
                } else {
                    positionA++;
                }
                timeA++;
                positionsA[timeA] = positionA;
            }
        }

        int positionB = 0;
        int timeB = 0;
        for (int i = 0; i < M; i++) {
            String[] order = sc.nextLine().split(" ");
            String direction = order[0];
            int moveTime = Integer.parseInt(order[1]);

            for (int t = 0; t < moveTime; t++) {
                if (direction.equals("L")) {
                    positionB--;
                } else {
                    positionB++;
                }
                timeB++;
                positionsB[timeB] = positionB;
            }
        }

        int meetingTime = -1;
        for (int t = 1; t <= timeA; t++) {
            if (positionsA[t] == positionsB[t]) {
                meetingTime = t;
                break;
            }
        }

        System.out.println(meetingTime);
    }
}
