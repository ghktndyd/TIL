package algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sampleArray = {12, 11, 13, 5, 6};

        insertionSort(sampleArray);

        Arrays.stream(sampleArray)
                .forEach(System.out::println);
    }

    public static void insertionSort(int[] arr) {
        int size = arr.length; // 배열의 크기 계산

        // 배열의 2번째 요소부터 시작해서 마지막 요소까지 반복
        for (int currentIndex = 1; currentIndex < size; currentIndex++) {
            // 현재 위치 값을 key 변수에 저장
            int currentElement = arr[currentIndex];

            // 현재 위치에서 왼쪽으로 한 칸씩 이동할 인덱스 변수
            int previousIndex = currentIndex - 1;

            // previousIndex가 0 이상이고
            // array[previousIndex]가 currentElement보다 큰 동안 반복
            while (previousIndex >= 0 && arr[previousIndex] > currentElement) {
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex--;
            }

            // currentElement를 삽입
            arr[previousIndex + 1] = currentElement;
        }
    }
}
