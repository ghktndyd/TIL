package javaexam;

enum Direction {
    EAST, SOUTH, WEST, NORTH
}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2)); // false
        System.out.println("(d1 == d3) = " + (d1 == d3)); // true

        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 0, 같은 객체라고 인식
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d2))); // d2가 크다고 인식

        Direction[] values = Direction.values();

        for (Direction direction : values) {
            System.out.printf("%s = %d %n", direction.name(), direction.ordinal());
            // EAST = 0
            // SOUTH = 1
            // WEST = 2
            // NORTH = 3
        }

    }
}
