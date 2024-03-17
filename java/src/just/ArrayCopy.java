package just;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        /**
         * Arrays.copyOf(원본 배열, 복사할 길이)
         * 만약 길이를 3으로 지정시 인덱스 0부터 2까지
         */
        int[] intArr = new int[]{1, 2, 3, 4, 5};

        int[] intArrCopy = Arrays.copyOf(intArr, 3);

        System.out.println("==== copyOf ====");
        for (int index : intArrCopy) {
            System.out.print(index + " ");
        }
        System.out.println();

        /**
         * Arrays.copyOfRange(원본 배열, 복사 시작, 복사 마지막)
         * 만약 1, 4로 지정시 인덱스 1부터 3까지
         */
        int[] intArrCopy2 = Arrays.copyOfRange(intArr, 1, 4);

        System.out.println("==== copyOfRange ====");
        for (int index2 : intArrCopy2) {
            System.out.print(index2 + " ");
        }
        System.out.println();

        /**
         * System.arraycopy(원본 배열, 원본배열 복사 시작, 붙여넣을 배열, 붙여넣기 시작 인덱스, 원본배열 복사 길이)
         * System.arraycopy(intArr, 1, intCopyArr3, 4, 2)
         * intCopyArr3 배열의 4번 요소에 intArr 배열의 1번 요소부터 2번 요소까지를 붙여넣는다.)
         */
        int[] intArrCopy3 = new int[5];

        System.arraycopy(intArr, 2, intArrCopy3, 1, 2);
        System.out.println("==== arraycopy ====");

        for (int index : intArrCopy3) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
