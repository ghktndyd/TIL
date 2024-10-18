package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternGroupExample {
    public static void main(String[] args) {
        String input = "user@example.com";
        String regex = "(\\w+)@(\\w+\\.\\w+)"; // 정규 표현식에서 ( )로 캡처 그룹을 정의하면 문자열을 그룹화할 수 있다.

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("전체 이메일: " + matcher.group(0));
            System.out.println("사용자명: " + matcher.group(1));
            System.out.println("도메인: " + matcher.group(2));
        }
    }
}
