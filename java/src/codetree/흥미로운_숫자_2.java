package codetree;

import java.util.Scanner;

public class 흥미로운_숫자_2 {

    public static int x;
    public static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextInt();

        int answer = 0;

        for (int i = x; i <= y; i++) {
            int num = i;
            int[] digit = new int[10];
            int allDigits = 0;

            while (num > 0) {
                digit[num % 10]++;
                allDigits++;
                num /= 10;
            }

            boolean interesting = false;

            for (int j = 0; j < 10; j++) {
                if (digit[j] == allDigits - 1) {
                    interesting = true;
                }
            }

            if (interesting) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
