package codetree;

public class 중완탐 {
    public static int n = 5;
    public static int[] arr = new int[]{1, 5, 2, 6, 8};

    public static void main(String[] args) {
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            arr[i] *= 2;

            for (int j = 0; j < n; j++) {
                int[] remainingArr = new int[4];
                int cnt = 0;

                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        remainingArr[cnt++] = arr[k];
                    }
                }

                int sumDiff = 0;
                for (int k = 0; k < n - 2; k++) {
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }

                maxDiff = Math.max(maxDiff, sumDiff);
            }

            arr[i] /= 2;
        }

        System.out.println(maxDiff);
    }
}
