package javaexam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList 선언

        for (int i = 0; i < 10; i++) {
            list.add(i); // list에 0부터 9까지 채워넣음
        }

        // list의 모든 요소 출력
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // list에서 2 또는 3의 배수 제거
        list.removeIf(n -> n % 2 == 0 || n % 3 == 0);
        System.out.println(list);

        // list 요소들에 10을 곱하여 대체한다.
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i + 1), String.valueOf(i + 1));
        }

        // map의 모든 요소를 {Key, Value} 형태로 출력
        map.forEach((k, v) -> System.out.printf("{%s, %s}, ", k, v));
    }
}
