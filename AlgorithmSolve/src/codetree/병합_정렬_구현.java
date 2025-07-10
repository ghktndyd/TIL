package codetree;

import java.util.Arrays;
import java.util.Scanner;

public class 병합_정렬_구현 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        병합_정렬_구현 병합_정렬_구현 = new 병합_정렬_구현();

        int[] temp = new int[n];
        병합_정렬_구현.mergeSort(arr, temp, 0, arr.length - 1);

        Arrays.stream(arr)
                .forEach(i -> System.out.print(i + " "));
    }

    private void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);

            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(temp, low, arr, low, high - low + 1);
    }
}