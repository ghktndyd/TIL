package codetree;

import java.util.Scanner;

public class 괄호_쌍_만들어주기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        int n = string.length();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == '(') {
                for (int j = i + 1; j < n; j++) {
                    if (string.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
