package programmers;

public class P12922 {
    public static void main(String[] args) {
        P12922 p12922 = new P12922();
        System.out.println(p12922.solution(4));
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}
