package algorithm;

import java.util.Scanner;

public class BracketBalanceCheckerWithInput {
    public static String test(String s) {
        int maxOpen = 0; // '?'를 '(' 로 취급
        int minOpen = 0; // '?'를 ')' 로 취급

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen = Math.max(minOpen - 1, 0); // minOpen은 반드시 0보다 커야 됨.
                maxOpen--; // maxOpen이 음수라면
                if (maxOpen < 0) {
                    return "No";
                }
            } else { //  '?'
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen++;
            }
        }
        return minOpen == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 문자열의 길이

        if (N % 2 != 0) { // 문자열 길이가 홀수인 경우 바로 No
            System.out.println("No");
        } else {
            String s = scanner.next(); // 문자열 입력

            if (s.length() != N) {
                System.out.println("입력한 길이와 문자열의 길이가 같지 않습니다.");
            } else {
                System.out.println(test(s));
            }
        }
    }
}
