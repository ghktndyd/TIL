package programmers;

public class 모음제거 {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
