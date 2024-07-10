package codetree;

import java.util.Scanner;

public class 재귀_1부터_특정_수까지의_합2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(sum(N));
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return sum(n - 1) + n;
    }
}
