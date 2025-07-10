package codetree;

import java.util.Scanner;
import java.util.Stack;

public class 정수_명령_처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orderCount = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < orderCount; i++) {
            String order = sc.nextLine();

            if (order.startsWith("push")) {
                String[] strings = order.split(" ");
                stack.push(Integer.parseInt(strings[1]));
            } else if (order.equals("pop")) {
                System.out.println(stack.pop());
            } else if (order.equals("size")) {
                System.out.println(stack.size());
            } else if (order.equals("empty")) {
                System.out.println(stack.empty() ? 1 : 0);
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}
