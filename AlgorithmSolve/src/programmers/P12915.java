package programmers;

import java.util.Arrays;

public class P12915 {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);

            if (c1 == c2) {
                return o1.compareTo(o2);
            }
            return Character.compare(c1, c2);
        });

        return strings;
    }

    public static void main(String[] args) {

    }
}
