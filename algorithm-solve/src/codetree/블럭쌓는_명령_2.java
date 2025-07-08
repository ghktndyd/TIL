package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 블럭쌓는_명령_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 최대 칸
        int K = sc.nextInt(); // 명령 수

        int[] blocks = new int[101];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; j <= B; j++) {
                blocks[j]++;
            }
        }

        int maxIndex = Arrays.stream(blocks)
                .max()
                .getAsInt();

        System.out.println(maxIndex);
    }
}
