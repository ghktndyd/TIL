package programmers;

public class n의배수 {
    class Solution {
        public int solution(int num, int n) {
            int answer = (num % n == 1) ? 0 : 1;
            return answer;
        }
    }
}