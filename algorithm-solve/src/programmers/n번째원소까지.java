package programmers;

public class n번째원소까지 {
    public static void main(String[] args) {
        int[] ints = {2, 1, 6};

        solution(ints, 1);
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
