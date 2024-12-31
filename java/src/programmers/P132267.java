package programmers;

public class P132267 {
    public int solution(int a, int b, int n) {
        int result = 0;

        while (n >= a) {
            result += (n / a) * b;
            n = (n / a) * b + n % a;
        }

        return result;
    }
}
