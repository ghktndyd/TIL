package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> card1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2 = new LinkedList<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!card1.isEmpty() && card1.peek().equals(word)) {
                card1.poll();
            } else if (!card2.isEmpty() && card2.peek().equals(word)) {
                card2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
