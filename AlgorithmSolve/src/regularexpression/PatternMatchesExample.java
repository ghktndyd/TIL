package regularexpression;

import java.util.regex.Pattern;

public class PatternMatchesExample {
    public static void main(String[] args) {
        String input = "12345";
        String regex = "\\d+";

        if (Pattern.matches(regex, input)) {
            System.out.println("입력 문자열은 숫자로만 이루어졌습니다.");
            return;
        }

        throw new IllegalArgumentException();
    }
}
