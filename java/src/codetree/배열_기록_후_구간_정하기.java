package codetree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열_기록_후_구간_정하기 {
    public static int N;
    public static int K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int position = sc.nextInt();
            char flag = sc.next().charAt(0);
            people.add(new Person(position, flag));
        }

        int maxScore = 0;

        for (int i = 0; i < N; i++) {
            int start = people.get(i).position;
            int end = start + K;
            int currentScore = 0;

            for (int j = 0; j < N; j++) {
                int position = people.get(j).position;
                if (position >= start && position <= end) {
                    if (people.get(j).flag == 'G') {
                        currentScore += 1;
                    } else if (people.get(j).flag == 'H') {
                        currentScore += 2;
                    }
                }
            }

            maxScore = Math.max(maxScore, currentScore);
        }

        System.out.println(maxScore);
    }
}

class Person {
    int position;
    char flag;

    public Person(int position, char flag) {
        this.position = position;
        this.flag = flag;
    }
}
