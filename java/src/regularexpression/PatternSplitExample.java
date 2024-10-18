package regularexpression;

import java.util.regex.Pattern;

public class PatternSplitExample {
    public static void main(String[] args) {
        String input = "apple, orange banana";
        String regex = "[,\\s]+";

        Pattern pattern = Pattern.compile(regex);

        // split() - pattern 으로 문자열을 분리한다.
        String[] result = pattern.split(input);

        for (String word : result) {
            System.out.println(word);
        }
    }
}
