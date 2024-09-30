package codetree;

import java.util.Scanner;

public class Carry_피하기_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isNoCarry(numbers[i], numbers[j], numbers[k])) {
                        int sum = numbers[i] + numbers[j] + numbers[k];
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }

    private static boolean isNoCarry(int first, int second, int third) {
        while (first > 0 || second > 0 || third > 0) {
            int digitFirst = first % 10;
            int digitSecond = second % 10;
            int digitThird = third % 10;

            if (digitFirst + digitSecond + digitThird >= 10) {
                return false;
            }

            first /= 10;
            second /= 10;
            third /= 10;
        }

        return true;
    }
}
