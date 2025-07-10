package codetree.recursion;

import java.util.Scanner;

public class 재귀_각_자리_숫자의_제곱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = fact(N);

        System.out.println(result);
    }

    private static int fact(int n) {
        if (n < 10) {
            return n * n;
        }

        int digit = n % 10;

        return fact(n / 10) + digit * digit;
    }
}
