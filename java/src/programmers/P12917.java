package programmers;

import java.util.stream.Collectors;

public class P12917 {
    public String solution(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .sorted((a, b) -> b - a)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
