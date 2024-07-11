package codetree;

import java.util.Scanner;

public class 재귀_피보나치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = fibo(n);
        System.out.println(result);
    }

    private static int fibo(int n) {

        if (n <= 2) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
