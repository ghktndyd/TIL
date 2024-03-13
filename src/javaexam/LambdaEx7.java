package javaexam;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        // 문자열 s를 입력 받아서, 16진수 정수로 반환하는 함수
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);

        // 10진수 정수를 입력 받아서, 2진수 문자열 형태로 반환하는 함수
        Function<Integer, String> g = i -> Integer.toBinaryString(i);

        // f 먼저 실행하고, 이후에 g를 실행한다.
        Function<String, String> h = f.andThen(g);

        // g 먼저 실행하고, 이후에 f를 실행한다.
        Function<Integer, Integer> h2 = f.compose(g);

        // 16진수 형태의 문자열을 입력하고 f 함수를 통해서
        // 16진수 정수로 변경하고 그 반환 값을 g 함수를 통해서
        // 2진수 문자열 형태로 반환
        String ff = h.apply("FF");
        System.out.println("ff = " + ff);

        Integer ff2 = h2.apply(2);
        System.out.println("ff2 = " + ff2);

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        // i가 200보다 작거나 짝수여야 한다.
        // 또한 i는 100보다 크거나 같아야 한다.
        Predicate<Integer> all = notP.and(q.or(r));

        System.out.println(all.test(150));
    }
}
