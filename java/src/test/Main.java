package test;

import java.util.Scanner;

public class Main {

    private static final int MAX_DICE_NUM = 6;

    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int tryCount = scanner.nextInt();

        RandomGenerator generator = new RandomGenerator();
        Dice dice = new Dice(MAX_DICE_NUM);
        DiceRollResults results = dice.roll(tryCount, generator);

        for (int i = 1; i <= MAX_DICE_NUM; i++) {
            System.out.printf("%d%s %d번 나왔습니다.%n", i, getParticle(MAX_DICE_NUM), results.get(i));
        }
    }


    private static String getParticle(int num) {
        return switch (num) {
            case 1, 3, 6 -> "은";
            case 2, 4, 5 -> "는";
            default -> throw new IllegalArgumentException("");
        };
    }
}
