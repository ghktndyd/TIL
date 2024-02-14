package javaexam;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 길이가 45인 배열 생성

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; // 1부터 45를 배열 ball의 요소에 삽입
        }

        int temp = 0; // 두 값을 바꿀 때 임시로 사용
        int j = 0; // 임의의 값을 얻을 변수

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
