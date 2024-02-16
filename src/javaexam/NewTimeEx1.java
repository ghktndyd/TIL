package javaexam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDay = LocalDate.of(1999, 12, 13);// 내 생일
        LocalTime birthTime = LocalTime.of(23, 30, 30);// 내가 태어난 시간

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDay = " + birthDay);
        System.out.println("birthTime = " + birthTime);
        System.out.println("===============");

        LocalDate birthDatePlusOneYear = birthDay.withYear(2000);// 태어난 연도를 2000년으로 변경
        System.out.println("birthDatePlusOne = " + birthDatePlusOneYear);

        // 시간 아래 단위 즉 분이랑 초를 0으로 바꾸기
        System.out.println("시간 단위 아래는 0으로 -> " + birthTime.truncatedTo(ChronoUnit.HOURS));
    }
}
