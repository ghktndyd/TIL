package javaexam;

// 총합과 평균
public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg;

        int[] scores = {100, 88, 90, 87, 90};

        for (int score : scores) {
            sum += score;
        }

        avg = (float) sum / scores.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
