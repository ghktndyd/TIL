package programmers;

public class P12948 {
    public static String solution(String phoneNumber) {
        char[] charArray = phoneNumber.toCharArray();
        int originalIndex = charArray.length - 4;
        for (int i = 0; i < originalIndex; i++) {
            charArray[i] = '*';
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }
}
