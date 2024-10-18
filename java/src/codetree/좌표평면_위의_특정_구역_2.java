package codetree;

import java.util.Scanner;

public class 좌표평면_위의_특정_구역_2 {

    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;
    public static final int MAX_COORDINATE = 40_000;

    public static int pointCount = MAX_N;
    public static int[] xCoordinates = new int[MAX_N];
    public static int[] yCoordinates = new int[MAX_N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 점 갯수 입력
        pointCount = scanner.nextInt();

        // 각 점의 x좌표와 y좌표 입력
        for (int i = 0; i < pointCount; i++) {
            xCoordinates[i] = scanner.nextInt();
            yCoordinates[i] = scanner.nextInt();
        }

        // 최소 직사각형 넓이를 저장할 변수
        int minArea = INT_MAX;

        // 모든 점 중 하나씩 제외하면서 남은 점들로 직사각형을 계산
        for (int excludedIndex = 0; excludedIndex < pointCount; excludedIndex++) {

            // 제외된 점을 빼고, 남은 점들로 직사각형을 만들기 위한 최소/최대 x, y 좌표 초기화
            int minX = MAX_COORDINATE;
            int maxX = 1;
            int minY = MAX_COORDINATE;
            int maxY = 1;

            // 각 점을 순회하며, 제외된 점은 건너뛰고, 나머지 점들로 최소/최대 x, y 좌표 갱신
            for (int i = 0; i < pointCount; i++) {
                if (i == excludedIndex) {
                    continue;
                }

                minX = Math.min(minX, xCoordinates[i]);
                maxX = Math.max(maxX, xCoordinates[i]);
                minY = Math.min(minY, yCoordinates[i]);
                maxY = Math.max(maxY, yCoordinates[i]);
            }

            // 남은 점들로 만든 직사각형의 넓이를 계산하고, 최솟값 기록
            int area = (maxX - minX) * (maxY - minY);
            minArea = Math.min(minArea, area);
        }

        System.out.println(minArea);
    }
}
