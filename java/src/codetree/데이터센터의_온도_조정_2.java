package codetree;

import java.util.Scanner;

public class 데이터센터의_온도_조정_2 {

    public static final int MAX_N = 1_000;

    public static int[] ta = new int[MAX_N];
    public static int[] tb = new int[MAX_N];

    public static int machineCount;
    public static int c;
    public static int g;
    public static int h;

    public static int singleEfficiency(int ta, int tb, int t) {
        if (t < ta) {
            return c;
        }

        if (t <= tb) {
            return g;
        }

        return h;
    }

    public static int getPerformance(int t) {
        int totalPerformance = 0;

        for (int i = 0; i < machineCount; i++) {
            totalPerformance += singleEfficiency(ta[i], tb[i], t);
        }

        return totalPerformance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        machineCount = scanner.nextInt();
        c = scanner.nextInt();
        g = scanner.nextInt();
        h = scanner.nextInt();

        for (int i = 0; i < machineCount; i++) {
            ta[i] = scanner.nextInt();
            tb[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < MAX_N; i++) {
            result = Math.max(result, getPerformance(i));
        }

        System.out.println(result);
    }
}
