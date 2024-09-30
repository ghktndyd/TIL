package codetree;

import java.util.Scanner;

public class 이상한_진수_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        char[] binaryNumbers = N.toCharArray();

        // 0이 포함되어 있는 경우
        if (N.contains("0")) {
            // 첫 번째 '0'을 '1'로 변경
            for (int i = 0; i < binaryNumbers.length; i++) {
                if (binaryNumbers[i] == '0') {
                    binaryNumbers[i] = '1';
                    break;
                }
            }
        } else {
            // 0이 없으면 마지막 문자를 '0'으로 변경
            binaryNumbers[binaryNumbers.length - 1] = '0';
        }

        System.out.println(convertBinaryToDecimal(binaryNumbers));
    }

    private static int convertBinaryToDecimal(char[] binaryNumbers) {
        return Integer.parseInt(new String(binaryNumbers), 2);
    }
}
