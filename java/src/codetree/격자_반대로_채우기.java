package codetree;

import java.util.Scanner;

public class 격자_반대로_채우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n을 입력받습니다.
        int n = sc.nextInt();

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[10][10];

        // 격자를 채워줍니다.
        int count = 1;
        for (int col = n - 1; col >= 0; col--) {
            if ((n - 1 - col) % 2 == 0) {
                // 이 케이스에는 아래에서 위로 값을 채워줍니다.
                for (int row = n - 1; row >= 0; row--) {
                    arr[row][col] = count;
                    count++;
                }
            } else {
                // 이 케이스에는 위에서 아래로 값을 채워줍니다.
                for (int row = 0; row < n; row++) {
                    arr[row][col] = count;
                    count++;
                }
            }
        }

        // 출력:
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}