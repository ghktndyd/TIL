package programmers;

import java.util.Scanner;

public class 대문자는소문자소문자는대문자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        System.out.print(sb);

    }
}
