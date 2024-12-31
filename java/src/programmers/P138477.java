package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> best = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (best.size() < k) {
                best.add(score[i]);
            } else {
                if (best.get(0) < score[i]) {
                    best.set(0, score[i]);
                }
            }

            Collections.sort(best);
            answer[i] = best.get(0);
        }

        return answer;
    }
}
