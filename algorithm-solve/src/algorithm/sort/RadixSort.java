package algorithm.sort;

import java.util.Arrays;

public class RadixSort {

    static int getMax(int[] arr, int n) {
        int max = arr[0]; // 1. 배열의 첫 요소를 최대 값으로 초기화

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // 현재 자릿수(exp)에 대해 배열을 정렬하는 함수 (기수 정렬)
    static void countSort(int[] arr, int n, int exp) {
        int[] count = new int[10]; // 각 숫자의 빈도를 저장하는 배열
        int[] result = new int[n]; // 정렬된 결과를 저장하는 배열

        // count 배열을 0으로 초기화
        Arrays.fill(count, 0);

        // count 배열에 각 숫자의 빈도 저장
        for (int i = 0; i < n; i++) {
            // 현재 자릿수의 숫자를 계산
            // 만약 2번째 자릿수라면 (350 / 2) % 10
            int index = (arr[i] / exp) % 10;

            result[count[index] - 1] = arr[i];
            count[index]--;
        }

        // 원본 배열에 결과 배열을 복사
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    // 기수 정렬 메서드
    static void radixSort(int[] arr, int n) {
        // 배열에서 최대값을 찾아서 몇자리인지 계산
        int max = getMax(arr, n);

        // 자릿수마다 정렬
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    public static void main(String[] args) {

    }
}
