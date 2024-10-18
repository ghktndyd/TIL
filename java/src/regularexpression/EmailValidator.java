package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_PATTERN = "^[a-zA-z0-9_.-]+@[a-zA-Z0-9.-]+$";
    // 이메일 계정 부분은 알파벳 대소문자, 숫자, 언더바, 쉼표, 하이픈으로 구성 가능하다.
    // 반드시 하나의 @ 가 포함되어야 한다.
    // 이메일의 도메인 부분은 알파벳 대소문자, 숫자, 쉼표, 하이픈으로 구성 가능하다.

    public static boolean isValidEmail(String email) {

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }


    public static void main(String[] args) {
        String email = "email_test@example.com";

        if (isValidEmail(email)) {
            System.out.println(email + " <- 이 이메일은 유효한 형식입니다.");
            return;
        }

        throw new IllegalArgumentException("이메일 형식이 유효하지 않습니다.");
    }
}
