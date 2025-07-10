package codetree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 정수_명령_처리_3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String order = sc.nextLine();

            if (order.startsWith("push_front")) {
                String number = order.split(" ")[1];
                deque.addFirst(Integer.parseInt(number));
            } else if (order.startsWith("push_back")) {
                String number = order.split(" ")[1];
                deque.addLast(Integer.parseInt(number));
            } else if (order.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (order.equals("pop_back")) {
                System.out.println(deque.pollLast());
            } else if (order.equals("size")) {
                System.out.println(deque.size());
            } else if (order.equals("empty")) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (order.equals("front")) {
                System.out.println(deque.peekFirst());
            } else {
                System.out.println(deque.peekLast());
            }
        }
    }
}
