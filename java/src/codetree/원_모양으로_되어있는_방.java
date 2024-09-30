package codetree;

import java.util.Scanner;

public class 원_모양으로_되어있는_방 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {

        int roomCount = SCANNER.nextInt();
        int[] peopleCapacity = new int[roomCount];

        for (int i = 0; i < roomCount; i++) {
            peopleCapacity[i] = SCANNER.nextInt();
        }

        int ans = MAX_INT;

        for (int startRoom = 0; startRoom < roomCount; startRoom++) {
            int sumDistance = 0;

            for (int targetRoom = 0; targetRoom < roomCount; targetRoom++) {
                int distance = (targetRoom + roomCount - startRoom) % roomCount;
                sumDistance += distance * peopleCapacity[targetRoom];
            }

            ans = Math.min(ans, sumDistance);
        }

        System.out.println(ans);
    }
}
