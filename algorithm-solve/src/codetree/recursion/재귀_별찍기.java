package codetree.recursion;

import java.util.Scanner;

public class 재귀_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printStar(sc.nextInt());
    }

    private static void printStar(int count) {
        if (count == 0) {
            return;
        }

        printStar(count - 1);
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
