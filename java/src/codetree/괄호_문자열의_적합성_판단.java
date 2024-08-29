package codetree;

import java.util.Scanner;
import java.util.Stack;

public class 괄호_문자열의_적합성_판단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        char[] charArray = string.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
