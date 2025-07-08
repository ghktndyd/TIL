package programmers;

public class P86491 {
    public int solution(int[][] size) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < size.length; i++) {
            maxWidth = Math.max(maxWidth, Math.max(size[i][0], size[i][1]));
            maxHeight = Math.max(maxHeight, Math.min(size[i][0], size[i][1]));
        }

        return maxWidth * maxHeight;
    }
}
