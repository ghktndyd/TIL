package javaexam;
// 최소값, 최대값
public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = {79, 88, 91, 33, 100, 55, 99};

        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            } else if (scores[i] < min) {
                min = scores[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
