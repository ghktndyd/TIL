package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInsensitiveExample {
    public static void main(String[] args) {

        String input = "Hello world";
        String regex = "HELLO";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // 대소문자를 구분하지 않도록 설정
        // Pattern.MULTILINE: 여러 줄에서 ^와 $가 각 줄의 시작과 끝을 의미하게 만든다.
        // Pattern.DOTALL: .이 줄 바꿈 문자를 포함하도록 설정한다.
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("대소문자 구분 없이 'HELLO' 를 찾았습니다.");
            return;
        }

        throw new IllegalArgumentException("대소문자 구분 없이 'HELLO'를 찾을 수 없습니다.");
    }
}
