package javaexam;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = (int) (Math.random() * code.length);
            arr[i] = code[randomNumber];
        }

        System.out.print(Arrays.toString(arr));
    }
}
