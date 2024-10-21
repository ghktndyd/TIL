package codetree;

import java.util.Scanner;

public class 가장_가까운_두_점_사이의_거리 {

    public static final int MAX_N = 100;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                minDistance = Math.min(minDistance, getDistance(i, j));
            }
        }

        System.out.println(minDistance);
    }

    public static int getDistance(int i, int j) {
        return (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
    }
}
