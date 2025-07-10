package javaexam;

import java.util.Arrays;
import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA, BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA, BBB"}};

        System.out.print("str2D = {");
        for (String[] tmp : str2D) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.print("str2D2 = {");
        for (String[] tmp : str2D2) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");
        System.out.println();

        //Objects 메서드
        // 2차원 배열은 그냥 equals로는 비교 불가
        boolean ObjectsEquals = Objects.equals(str2D, str2D2);
        System.out.println("ObjectsEquals = " + ObjectsEquals);

        // 2차원 배열은 deepEquals를 사용
        boolean ObjectsDeepEquals = Objects.deepEquals(str2D, str2D2);
        System.out.println("ObjectsDeepEquals = " + ObjectsDeepEquals);
        System.out.println();
    }
}
