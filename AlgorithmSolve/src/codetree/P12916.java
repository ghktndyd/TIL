package codetree;

public class P12916 {
    public boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCount++;
            }

            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount++;
            }
        }

        if (pCount != yCount) {
            return !answer;
        }

        return answer;
    }
}
