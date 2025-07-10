package programmers;

public class P81301 {
    public int solution(String s) {
        String[] englishNumbers =
                new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < englishNumbers.length; i++) {
            s = s.replaceAll(englishNumbers[i], String.valueOf(numbers[i]));
        }

        return Integer.parseInt(s);
    }
}
