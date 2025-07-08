package javaexam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        // 매개변수는 없고, 반환값만 있음
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;

        // 매개변수만 있고, 반환값은 없음
        Consumer<Integer> c = i -> System.out.print(i + ", ");

        // 매개변수는 1개고, 반환값은 있으나 타입이 boolean
        Predicate<Integer> p = i -> i % 2 == 0;

        // 매개변수 1개이며, 반환값도 1개
        Function<Integer, Integer> f = integer -> integer / 10 * 10;

        List<Integer> integerList = new ArrayList<>();
        makeRandomList(s, integerList);
        System.out.println(integerList);

        printEvenNum(p, c, integerList);

        List<Integer> newList = doSomething(f, integerList);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        ArrayList<T> newList = new ArrayList<>(list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
