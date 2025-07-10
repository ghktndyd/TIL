package programmers;

public class P12903 {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            return String.valueOf(s.charAt(s.length() / 2 - 1) + String.valueOf(s.charAt(s.length() / 2)));
        }
        return String.valueOf(s.charAt(s.length() / 2));
    }

    public static void main(String[] args) {
        P12903 p12903 = new P12903();
        System.out.println(p12903.solution("qwer"));
    }
}
