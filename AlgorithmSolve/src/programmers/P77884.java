package programmers;

public class P77884 {
    public static void main(String[] args) {
        System.out.println(getMeasure(17));
    }

    public int solution(int left, int right) {
        int calculateResult = 0;

        for (int i = left; i <= right; i++) {
            int measureCount = getMeasure(i);
            if (measureCount % 2 == 0) {
                calculateResult += i;
            }
            if (measureCount % 2 == 1) {
                calculateResult -= i;
            }
        }
        return calculateResult;
    }

    // number의 약수 개수를 구하는 공식
    private static int getMeasure(int number) {
        int count = 0;
        for (int j = 1; j * j <= number; j++) {
            if (j * j == number) {
                count++;
            } else if (number % j == 0) {
                count += 2;
            }
        }
        return count;
    }
}
