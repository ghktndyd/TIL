package programmers;

public class P134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }

        sb.append("0");

        for (int i = food.length - 1; i >= 1; i--) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        P134240 p134240 = new P134240();
        System.out.println(p134240.solution(new int[]{1, 3, 4, 6}));
    }
}
