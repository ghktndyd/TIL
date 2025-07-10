package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isSorted = true;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int addNum = sc.nextInt();
            arr[i] = addNum;
        }

        int tmp;

        do {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        Arrays.stream(arr)
                .forEach(num -> System.out.print(num + " "));
    }
}
