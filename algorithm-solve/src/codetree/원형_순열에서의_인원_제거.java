package codetree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 원형_순열에서의_인원_제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {

            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }

            System.out.print(queue.poll() + " ");
        }

        System.out.println(queue.poll());
    }
}
