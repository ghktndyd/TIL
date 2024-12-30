package programmers;

import java.util.HashMap;
import java.util.Map;

public class P142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charMap.containsKey(currentChar)) {
                answer[i] = i - charMap.get(currentChar);
            } else {
                answer[i] = -1;
            }

            charMap.put(currentChar, i);
        }

        return answer;
    }
}
