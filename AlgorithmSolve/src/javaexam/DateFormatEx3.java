package javaexam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat dataFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat dataFormat2 = new SimpleDateFormat("yyyy::MM::dd");

        try {
            Date date = dataFormat.parse("2023년 02월 16일");
            System.out.println(dataFormat2.format(date));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
