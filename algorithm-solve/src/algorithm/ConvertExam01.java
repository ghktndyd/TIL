package algorithm;

import java.util.Scanner;

public class ConvertExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int B = scanner.nextInt();

        if (B == 4 || B == 8) {
            String result = convertToBase(N, B);
            System.out.print(result);
        }
    }

    public static String convertToBase(int N, int B) {
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            sb.insert(0, remainder);
            N /= B;
        }

        return sb.toString();
    }
}
