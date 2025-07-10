package programmers;

public class 시저암호 {
    public static void main(String[] args) {
        String solution = new 시저암호()
                .solution("a B z", 4);

        System.out.println(solution);

        System.out.println(2 % 26);
    }

    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : charArr) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                continue;
            }

            char start = Character.isLowerCase(c) ? 'a' : 'A';

            char newChar = (char) (start + (c + n - start) % 26);
            sb.append(newChar);
        }

        return sb.toString();
    }
}
