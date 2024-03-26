package javaexam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWithStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Number[] numbers = new Number[N];
        // 위치 변경 추적용 배열
        int[] newPosition = new int[N];

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            numbers[i] = new Number(i + 1, value);
        }

        Arrays.sort(numbers, Comparator.comparingInt((Number number) -> number.value) // 1차적으로 Number 의 값으로 오름차순 정렬
                .thenComparingInt(number -> number.index)); // 만약 value가 같다면 index를 기준으로 정렬

        // 정렬 이후에 각 원소가 어디로 이동했는지 newPosition에 기록
        for (int i = 0; i < N; i++) {
            // 원래의 index를 새로운 배열에 저장
            newPosition[numbers[i].index - 1] = i + 1;
        }

        for (int pos : newPosition) {
            System.out.println(pos + " ");
        }
    }
}

class Number {
    int index;
    int value;

    public Number(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
