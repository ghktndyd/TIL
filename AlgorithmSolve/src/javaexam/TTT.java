package javaexam;

public class TTT {
    public static void main(String[] args) {
        int[] A = new int[]{0, 3, 0, 2, 3, 0};
        int[] B = new int[]{1, 2, 1};
        int i, j;
        for(i = 1; i < 5; i++) {
            int c = 0;
            for(j = 0; j < 3; j++) {
                c += A[i + j - 1] * B[j];
            }
            System.out.print(c);
        }
        System.out.println();
    }
}
