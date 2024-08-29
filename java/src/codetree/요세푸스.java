package codetree;

import java.util.LinkedList;
import java.util.Scanner;

public class 요세푸스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> queue = new LinkedList();

        for (int i = 1; i <= N; i++) {
            queue.addLast(i);
        }

        while (queue.size() != 1) {
            for (int i = 1; i < K; i++) {
                Integer first = queue.removeFirst();
                queue.addLast(first);
            }

            queue.removeFirst();
        }

        System.out.println(queue.getFirst());
    }
}
