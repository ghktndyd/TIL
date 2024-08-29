package codetree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 정수_명령_처리_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String order = sc.nextLine();

            if (order.startsWith("push")) {
                String data = order.split(" ")[1];
                queue.add(Integer.parseInt(data));
            } else if (order.equals("pop")) {
                System.out.println(queue.poll());
            } else if (order.equals("size")) {
                System.out.println(queue.size());
            } else if (order.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else {
                System.out.println(queue.peek());
            }
        }
    }
}
