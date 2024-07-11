package codetree.recursion;

import java.util.Scanner;

public class 재귀_1이_되는_순간까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(countOperation(N));
    }

    private static int countOperation(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return countOperation(n / 2) + 1;
        } else {
            return countOperation(n / 3) + 1;
        }
    }
}
