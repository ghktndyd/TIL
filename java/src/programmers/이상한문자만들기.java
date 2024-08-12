package programmers;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        이상한문자만들기 이상한문자만들기 = new 이상한문자만들기();
        String r = 이상한문자만들기.solution("try hello world");
        System.out.println(r);
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] strings = s.split("");

        int cnt = 0;

        for (String string : strings) {
            if (string.equals(" ")) {
                cnt = 0;
                sb.append(string);
                continue;
            } else {
                cnt++;
            }

            if (cnt % 2 == 0) {
                sb.append(string.toLowerCase());
            } else
                sb.append(string.toUpperCase());
        }

        return sb.toString();
    }
}
