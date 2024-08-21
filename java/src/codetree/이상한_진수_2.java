package codetree;

import java.util.Scanner;

public class 이상한_진수_2 {
    public static String N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.next();

        if (containsNumberZero(N)) {
            char[] charArray = N.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '0') {
                    charArray[i] = '1';
                    break;
                }
            }

            for (char c : charArray) {
                sb.append(c);
            }

            System.out.println(Integer.parseInt(sb.toString(), 2));
        } else {
            char[] charArray = N.toCharArray();
            charArray[N.length() - 1] = '0';

            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                sb.append(c);
            }

            System.out.println(Integer.parseInt(sb.toString(), 2));
        }
    }

    private static boolean containsNumberZero(String string) {
        return string.contains("0");
    }
}
