package programmers;

public class P133499 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            String[] canSayWords = {"aya", "ye", "woo", "ma"};

            for (String word : babbling) {
                boolean impossible = false;

                for (String canSayWord : canSayWords) {
                    if (word.contains(canSayWord.repeat(2))) {
                        impossible = true;
                        break;
                    }
                }

                if (impossible) {
                    continue;
                }

                String temp = word;
                for (String canSayWord : canSayWords) {
                    temp = temp.replace(canSayWord, " ");
                }

                if (temp.trim().length() == 0) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
