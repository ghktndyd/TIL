package regularexpression;

import java.util.regex.Pattern;

public class PatternQuote {
    public static void main(String[] args) {
        String input = "Price: $100";
        String regex = Pattern.quote("$");

        if (Pattern.matches(".*" + regex + ".*", input)) {
            System.out.println("문자열에 $가 있습니다.");
            return;
        }

        throw new IllegalArgumentException();
    }
}
