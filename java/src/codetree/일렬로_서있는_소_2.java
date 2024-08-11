package codetree;

import java.util.Scanner;

public class 일렬로_서있는_소_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cowCount = sc.nextInt();
        int[] cowHeights = new int[cowCount];

        for (int i = 0; i < cowCount; i++) {
            cowHeights[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i < cowCount; i++) {
            for (int j = i + 1; j < cowCount; j++) {
                if (cowHeights[i] < cowHeights[j]) {
                    for (int k = j + 1; k < cowCount; k++) {
                        if (cowHeights[j] < cowHeights[k]) {
                            answer++;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
