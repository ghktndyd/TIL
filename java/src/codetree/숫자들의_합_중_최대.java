package codetree;

import java.util.Scanner;

public class 숫자들의_합_중_최대 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int result = 0;
        for (int i = x; i <= y; i++) {
            int digitSum = digitSum(i);
            result = Math.max(result, digitSum);
        }

        System.out.println(result);
    }

    public static int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
