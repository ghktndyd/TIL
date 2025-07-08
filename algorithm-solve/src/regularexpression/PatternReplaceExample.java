package regularexpression;

import java.util.regex.Pattern;

public class PatternReplaceExample {
    public static void main(String[] args) {
        String input = "Hello world, how are you?";
        String regex = "\\s";

        Pattern pattern = Pattern.compile(regex);

        // 공백을 언더바로 변경
        String result = pattern.matcher(input)
                .replaceAll("_");

        System.out.println(result);
    }
}
