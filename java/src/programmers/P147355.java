package programmers;

public class P147355 {
    public int solution(String t, String p) {
        int length = p.length();
        long number = Long.parseLong(p);

        int count = 0;
        for (int i = 0; i < t.length() - length + 1; i++) {
            String substring = t.substring(i, i + length);
            if (Long.parseLong(substring) <= number) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        P147355 p147355 = new P147355();
        p147355.solution("10203", "15");
    }
}
