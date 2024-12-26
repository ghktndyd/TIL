package programmers;

public class P12943 {
    public long solution(int num2) {
        long num = num2;

        if (num == 1) {
            return 0;
        }

        long count = 0;
        while (num != 1) {
            if (count >= 500) {
                return -1;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        P12943 p12943 = new P12943();
        long solution = p12943.solution(626331);
        System.out.println(solution);
    }
}
