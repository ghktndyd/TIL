package programmers;

// 소수 찾기
public class P12921 {
    public static void main(String[] args) {
        P12921 p12921 = new P12921();

        System.out.println(p12921.solution(5));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
