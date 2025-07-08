package algorithm.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] sampleArray = {12, 11, 13, 5, 6};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(sampleArray, 0, sampleArray.length - 1);

        for (int element : sampleArray) {
            System.out.println(element);
        }
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length]; // 임시 배열 생성
        int i = left; // 왼쪽 배열의 시작 인덱스
        int j = mid + 1; // 오른쪽 배열의 시작 인덱스
        int k = left; // 임시 배열의 시작 인덱스

        while (i <= mid && j <= right) { // 왼쪽 배열과 오른쪽 배열을 비교하면서 임시 배열에 저장
            if (arr[i] <= arr[j]) { // 왼쪽 배열의 값이 오른쪽 배열의 값보다 작거나 같으면
                temp[k++] = arr[i++]; // 왼쪽 배열의 값을 임시 배열에 저장
            } else { // 오른쪽 배열의 값이 왼쪽 배열의 값보다 작으면
                temp[k++] = arr[j++]; // 오른쪽 배열의 값을 임시 배열에 저장
            }
        }

        while (i <= mid) { // 왼쪽 배열에 남은 요소들을 임시 배열에 저장
            temp[k++] = arr[i++];
        }

        while (j <= right) { // 오른쪽 배열에 남은 요소들을 임시 배열에 저장
            temp[k++] = arr[j++];
        }

        for (int index = left; index < k; index++) { // 임시 배열의 값을 원본 배열에 복사
            arr[index] = temp[index];
        }
    }
}
