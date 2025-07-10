package codetree;

import java.util.Scanner;

public class 한_가지로_열리는_자물쇠 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if ((first + 2 >= i && i >= first - 2)
                            || (second + 2 >= j && j >= second - 2)
                            || (third + 2 >= k && k >= third - 2)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
