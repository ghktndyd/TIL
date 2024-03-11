package javaexam;

public class Main {
    public static void main(String[] args) {
        String str = "Lucky Boy";

        int i, score = 0;

        for (i = 0; i < str.length(); i++) {

            int ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                score += ch - 'A' + 1;
            }

        }
        System.out.println(score);
    }
}