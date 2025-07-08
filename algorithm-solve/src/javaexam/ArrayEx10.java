package javaexam;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        } // 길이 10짜리 배열에 0~9까지의 임의의 수를 채운다.

        System.out.println(Arrays.toString(numArr)); // 임의의 수가 어떻게 나왔는지 확인

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false; // 자리바꿈 발생 체크 용도

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true; // 자리바꿈 발생
                }
            }

            if (!changed) break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
