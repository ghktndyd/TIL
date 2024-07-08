package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 배열 채우기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택 정렬 알고리즘
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        Arrays.stream(arr)
                .forEach(num -> System.out.print(num + " "));
    }
}
