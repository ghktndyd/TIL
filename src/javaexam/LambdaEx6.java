package javaexam;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaEx6 {
    public static void main(String[] args) {
        // 매개변수는 없고, 반환값만 있음
        IntSupplier s = () -> (int) (Math.random() * 100) + 1;

        // 매개변수만 있고, 반환값은 없음
        IntConsumer c = i -> System.out.print(i + ", ");

        // 매개변수는 1개고, 반환값은 있으나 타입이 boolean
        IntPredicate p = i -> i % 2 == 0;

        // 매개변수 1개이며, 반환값도 1개
        IntUnaryOperator op = integer -> integer / 10 * 10;

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));

        printEvenNum(p, c, arr);

        int[] newList = doSomething(op, arr);
        System.out.println(Arrays.toString(newList));
    }

    static int[] doSomething(IntUnaryOperator f, int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < newList.length; i++) {
            newList[i] = f.applyAsInt(list[i]);
        }
        return newList;
    }

    static <T> void printEvenNum(IntPredicate p, IntConsumer c, int[] list) {
        System.out.print("[");
        for (int i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(IntSupplier s, int[] list) {
        for (int i = 0; i < 10; i++) {
            list[i] = s.getAsInt();
        }
    }
}
