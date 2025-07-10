package codetree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class P12933 {
    public long solution(long n) {
        String answer = String.valueOf(n)
                .chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Long.parseLong(answer);
    }

    public long solution2(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        Arrays.sort(charArray);

        StringBuffer sb = new StringBuffer(new String(charArray)).reverse();

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        P12933 p12933 = new P12933();
        System.out.println(p12933.solution(118372));
    }
}
