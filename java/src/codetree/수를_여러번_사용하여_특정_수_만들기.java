package codetree;

import java.util.Scanner;

public class 수를_여러번_사용하여_특정_수_만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maxSum = 0;

        for (int i = 0; i * A <= C; i++) {
            for (int j = 0; j * B <= C; j++) {
                int sum = i * A + j * B;
                if (sum <= C && sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
