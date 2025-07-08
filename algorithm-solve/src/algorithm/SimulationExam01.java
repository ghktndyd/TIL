package algorithm;

import java.util.Scanner;

/**
 * 시간 차이를 계산하는 방법
 * a시 b분부터 c시 d분까지 몇 분이 걸리는지 계산하기
 */
public class SimulationExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // 출력
        System.out.println((c * 60 + d) - (a * 60 + b));
    }
}
