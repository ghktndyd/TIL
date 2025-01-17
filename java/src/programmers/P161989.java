package programmers;

// 덧칠하기
public class P161989 {
    public static void main(String[] args) {
        P161989 p161989 = new P161989();
        System.out.println(p161989.solution(8, 4, new int[]{2, 3, 6}));
    }

    public int solution(int n, int m, int[] section) {

        int answer = 1;
        int startIndex = section[0];

        for (int wall : section) {
            if (startIndex + m > wall) {
                continue;
            }

            answer++;
            startIndex = wall;
        }

        return answer;
    }
}
