package codetree;

import java.util.Scanner;

public class 독서실의_거리두기_5 {

    public static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 좌석의 개수 입력 받기
        N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 좌석 상태 입력 받기
        String seatString = scanner.nextLine();
        int[] seats = new int[N];

        // 문자열을 배열로 변환
        for (int i = 0; i < N; i++) {
            seats[i] = seatString.charAt(i) - '0';
        }

        int maxMinDistance = 0;

        // 모든 빈 자리(0)에 대해 시뮬레이션
        for (int i = 0; i < N; i++) {
            if (seats[i] == 0) {
                seats[i] = 1; // i번째 자리에 사람 추가

                int minDistance = calculateMinDistance(seats); // 현재 배치에서 가장 가까운 사람 간의 최소 거리
                maxMinDistance = Math.max(maxMinDistance, minDistance); // 최댓값 갱신

                seats[i] = 0; // 원래 상태로 되돌림
            }
        }

        System.out.print(maxMinDistance);
        scanner.close();
    }

    // 현재 좌석 배치에서 가장 가까운 두 사람 간의 최소 거리를 계산하는 메서드
    private static int calculateMinDistance(int[] seats) {
        int lastOccupied = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (lastOccupied != -1) {
                    minDistance = Math.min(minDistance, i - lastOccupied);
                }
                lastOccupied = i;
            }
        }

        return minDistance;
    }
}