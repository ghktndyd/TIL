package codetree.simulation;

import java.util.Scanner;

public class 작은_구슬의_이동 {
    public static final int ASCII_NUM = 128; // ASCII 문자수를 나타내는 상수

    public static int n, t; // 격자의 크기와 명령의 수
    public static int x, y, dir; // 현재 위치와 방향 저장 변수
    public static int[] mapper = new int[ASCII_NUM]; // 아스키 문자에 대응하는 배열

    public static int[] dx = new int[]{0, 1, -1, 0}; // x방향으로의 이동을 나타내는 배열
    public static int[] dy = new int[]{1, 0, 0, -1}; // y방향으로의 이동을 나타내는 배열

    // 주어진 좌표가 격자 내에 존재하는지 검증하는 메서드
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    // 명령의 수만큼 시뮬레이션을 돌리는 메서드
    public static void simulate() {
        while (t-- > 0) { // t가 0이 될 때까지, 즉 명령 수 만큼 반복하여 시뮬레이션
            int nx = x + dx[dir]; // 현재 바라보고 있는 방향으로 이동
            int ny = y + dy[dir];

            if (inRange(nx, ny)) { // 오류가 나지 않는 범위 내에 속하는지를 검증
                x = nx; // 오류가 안 난다면 좌표를 업데이트
                y = ny;
            } else {
                dir = 3 - dir; // 만약에 오류가 난다. 즉 벽에 부딪힌 거라면 방향을 반대로 전환
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        mapper['R'] = 0; // 오른쪽으로 설정
        mapper['D'] = 1; // 아래쪽으로 설정
        mapper['U'] = 2; // 위쪽으로 설정
        mapper['L'] = 3; // 왼쪽으로 설정

        x = sc.nextInt();
        y = sc.nextInt();

        char cDir = sc.next().charAt(0);

        x--;
        y--;
        dir = mapper[cDir];

        simulate();

        System.out.println((x + 1) + " " + (y + 1));
    }
}
