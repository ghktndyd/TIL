package javaexam;

import java.util.*;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = sc.next();
        String str = "apple";

//        String target = sc.next();
        String target = "pp";

        int fromIndex = 0;

        while ((fromIndex = str.indexOf(target, fromIndex)) != -1) {
            fromIndex++;
        }

        System.out.print(fromIndex);
    }
}