package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternLookingAtExample {
    public static void main(String[] args) {

        // lookingAt 메서드는 입력 문자열의 처음이 패턴과 매칭되는지 확인한다.
        // matches 메서드는 문자열 전체를 확인한다.
        // 하지만 lookingAt 메서드는 처음이 매칭하는지를 확인한다.

        String input = "123abc";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.lookingAt()) {
            System.out.println("문자열의 처음 시작이 숫자입니다.");
            return;
        }

        throw new IllegalArgumentException();
    }
}
