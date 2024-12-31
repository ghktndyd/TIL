package programmers;

public class P17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String arr1Map = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String arr2Map = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (arr1Map.charAt(j) == '1' || arr2Map.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
