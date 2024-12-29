package programmers;

public class P131705 {
    public int solution(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        P131705 p131705 = new P131705();
        System.out.println(p131705.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
}
