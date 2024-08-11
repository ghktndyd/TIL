package codetree;

import java.util.Scanner;

public class 모이자 {
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] houses = new int[n];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = sc.nextInt();
        }

        int minDistance = MAX_INT;

        for (int i = 0; i < houses.length; i++) {
            int sumDistance = 0;

            for (int j = 0; j < houses.length; j++) {
                sumDistance += Math.abs(j - i) * houses[j];
            }

            minDistance = Math.min(minDistance, sumDistance);
        }

        System.out.println(minDistance);
    }
}
