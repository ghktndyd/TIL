package codetree;

import java.util.Scanner;

public class 씨_오_더블유_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String target = sc.next();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (target.charAt(i) == 'C') {
                for (int j = i + 1; j < N; j++) {
                    if (target.charAt(j) == 'O') {
                        for (int k = j + 1; k < N; k++) {
                            if (target.charAt(k) == 'W') {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
