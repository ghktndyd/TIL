package programmers;

public class P86051 {
    public int solution(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }

        return sum;
    }
}
