package javaexam;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i; // 배열의 요소를 0~9로 초기화
            System.out.println("numArr[i] = " + numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); // 0~9 중 임의의 수 하나를 n에 대입
            int tmp = numArr[0]; // tmp 변수에 배열의 첫 번째 요소 대입
            numArr[0] = numArr[n]; // 배열의 첫 번째 요소에는 배열의 n번째 요소 대입
            numArr[n] = tmp; // 배열의 n번째 요소에는 배열의 첫 번째 요소 대입
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
