package programmers;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class P176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        LinkedHashMap<String, Integer> yearningName = new LinkedHashMap<>();

        for (int i = 0; i < name.length; i++) {
            yearningName.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {

                score += yearningName.getOrDefault(photo[i][j], 0);
            }

            answer[i] = score;
        }

        return answer;
    }

    public static void main(String[] args) {
        P176963 p176963 = new P176963();
        System.out.println(Arrays.toString(p176963.solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                }
        )));
    }
}
