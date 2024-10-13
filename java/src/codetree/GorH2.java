package codetree;

import java.util.Scanner;

public class GorH2 {

    public static final int MAX_N = 100;

    public static int N;
    public static int[] arr = new int[MAX_N + 1];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int index = scanner.nextInt();
            String alphabet = scanner.next();

            if ("G".equals(alphabet)) {
                arr[index] = 1;
            } else {
                arr[index] = 2;
            }
        }

        int maxLen = 0;
        for (int i = 0; i <= MAX_N; i++) {
            for (int j = i + 1; j <= MAX_N; j++) {
                if (arr[i] == 0 || arr[j] == 0) {
                    continue;
                }

                int countG = 0;
                int countC = 0;

                for (int k = i; k <= j; k++) {
                    if (arr[k] == 1) {
                        countG++;
                    }

                    if (arr[k] == 2) {
                        countC++;
                    }
                }

                if (countC == 0 || countG == 0 || countC == countG) {
                    int len = j - i;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        System.out.println(maxLen);
    }
}
