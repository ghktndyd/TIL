package programmers;

import java.time.LocalDate;

public class P12901 {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        return localDate.getDayOfWeek()
                .toString()
                .substring(0, 3);
    }
}
