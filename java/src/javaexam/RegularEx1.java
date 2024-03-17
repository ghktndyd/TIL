package javaexam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bouns", "clj", "crow"};

        Pattern pattern = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영어단어

        for (int i = 0; i < data.length; i++) {
            Matcher matcher = pattern.matcher(data[i]);
            if (matcher.matches()) {
                System.out.println(data[i] + ", ");
            }
        }
    }
}
