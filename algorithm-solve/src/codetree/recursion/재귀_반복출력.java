package codetree.recursion;

import java.util.Scanner;

public class 재귀_반복출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print(sc.nextInt());
    }

    static void print(int N) {
        if (N == 0) {
            return;
        }

        print(N - 1);
        System.out.println("HelloWorld");
    }
}
