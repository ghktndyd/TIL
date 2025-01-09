package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42840 {
    public int[] solution(int[] answers) {
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int student1AnswerCount = 0;

        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int student2AnswerCount = 0;

        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int student3AnswerCount = 0;

        for (int i = 0; i < answers.length; i++) {
            if (student1[i % student1.length] == answers[i]) {
                student1AnswerCount++;
            }

            if (student2[i % student2.length] == answers[i]) {
                student2AnswerCount++;
            }

            if (student3[i % student3.length] == answers[i]) {
                student3AnswerCount++;
            }
        }

        int[] scores = {student1AnswerCount, student2AnswerCount, student3AnswerCount};
        int maxScore = Arrays.stream(scores)
                .max()
                .getAsInt();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
