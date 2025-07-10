package codetree;

import java.util.Scanner;

public class 특정_구간의_원소_평균_값 {

    public static int N;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        N = SCANNER.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = SCANNER.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == j) {
                    answer++;
                    continue;
                }

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                double avg = (double) sum / (j - i + 1);
                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
