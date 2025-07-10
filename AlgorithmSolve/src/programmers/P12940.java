package programmers;

public class P12940 {
    public int[] solution(int n, int m) {
        int[] result = new int[2];

        result[0] = gcd(n, m);
        result[1] = lcm(n, m);

        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
