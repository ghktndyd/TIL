package javaexam;

import java.util.HashMap;
import java.util.Map;

public class 문자개수세기 {
    public static void main(String[] args) {
        Map<Character, Integer> ddd = countDuplicateCharacters("ddd");

        System.out.println("ddd = " + ddd);
    }

    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : string.toCharArray()) {
            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
            /** compute() 동작 순서
             * 1. char ch 를 key에 대입
             * 2-1. 만약 ch랑 매칭되는 key의 value가 null이라면 v를 1로 초기화
             * 2-2. 존재한다면 value 값에 +1
             */
        }
        return result;
    }
}
