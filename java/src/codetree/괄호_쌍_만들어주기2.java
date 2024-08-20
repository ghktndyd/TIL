package codetree;

import java.util.Scanner;

public class 괄호_쌍_만들어주기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();

        int count = 0;
        for (int i = 0; i < length - 3; i++) {
            if (str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
                for (int j = i + 2; j < length - 1; j++) {
                    if (str.charAt(j) == ')' && str.charAt(j + 1) == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
