package codetree.recursion;

import java.util.Scanner;

public class 홀수_짝수에_따른_출력값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        checkOddOrEven(sc.nextInt());
    }

    private static void checkOddOrEven(int number) {
        if (number % 2 == 1) {
            System.out.println(printOddSum(number));
        } else {
            System.out.println(printEvenSum(number));
        }
    }

    private static int printOddSum(int number) {
        if (number <= 0) {
            return 0;
        }

        if (number % 2 == 0) {
            number -= 1;
        }

        return number + printOddSum(number - 2);
    }

    private static int printEvenSum(int number) {
        if (number <= 0) {
            return 0;
        }

        if (number % 2 == 1) {
            number -= 1;
        }

        return number + printEvenSum(number - 2);
    }

}
