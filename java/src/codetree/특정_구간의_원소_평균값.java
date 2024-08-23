package codetree;

import java.util.Scanner;

public class 특정_구간의_원소_평균값 {
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    count++;
                    continue;
                }

                int tempCount = 0;
                int sum = 0;
                double avg = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    tempCount++;
                }

                avg = (double) sum / tempCount;

                for (int l = i; l <= j; l++) {
                    if ((double) arr[l] == avg) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.print(count);
    }
}
