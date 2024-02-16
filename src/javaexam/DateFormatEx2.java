package javaexam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.FEBRUARY, 16);

        Date date = calendar.getTime();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(simpleDateFormat1.format(date));
    }
}
