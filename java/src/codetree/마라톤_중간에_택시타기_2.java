package codetree;

import java.util.Scanner;

public class 마라톤_중간에_택시타기_2 {
    public static int N; // 체크포인트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point point = new Point(x, y);
            points[i] = point;
        }

        int totalDistance = 0;
        for (int i = 1; i < N; i++) {
            totalDistance += calculateManhattanDistance(points[i - 1], points[i]);
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < N - 1; i++) {
            int skippedDistance = totalDistance
                    - calculateManhattanDistance(points[i - 1], points[i])
                    - calculateManhattanDistance(points[i], points[i + 1])
                    + calculateManhattanDistance(points[i - 1], points[i + 1]);

            minDistance = Math.min(minDistance, skippedDistance);
        }

        System.out.println(minDistance);
    }

    private static int calculateManhattanDistance(Point point1, Point point2) {
        return Math.abs(point1.x - point2.x) + Math.abs(point1.y - point2.y);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
