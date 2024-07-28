package programmers;

public class 분수의덧셈 {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int number = number1 * denom2 + number2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(number, denom);
        return new int[]{number / gcd, denom / gcd};
    }

    private int gcd(int number, int denom) {
        while (denom != 0) {
            int temp = number % denom;
            number = denom;
            denom = temp;
        }
        return number;
    }
}
