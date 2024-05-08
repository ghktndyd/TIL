package javaexam;

public class NumberObjects {
    public static long parseLong(String data) {
        try {
            return Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.printf("%s is not a number. \n", data);
            return -1;
        }
    }

    public void printOtherBase(long value) {
        System.out.println("Original: " + value);
        System.out.println("Binary: " + Long.toBinaryString(value));
        System.out.println("Hex: " + Long.toHexString(value));
        System.out.println("Octal: " + Long.toOctalString(value));
    }

    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();

        long r102 = parseLong("102");
        System.out.println(r102);

        numberObjects.printOtherBase(1024);
    }
}
