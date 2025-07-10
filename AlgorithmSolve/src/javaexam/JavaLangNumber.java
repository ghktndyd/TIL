package javaexam;

public class JavaLangNumber {
    public void numberMinMaxElapsedCheck() {
        JavaLangNumber javaLangNumber = new JavaLangNumber();

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        System.out.println("Milli second = " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));
    }

    public static void main(String[] args) {
        JavaLangNumber javaLangNumber = new JavaLangNumber();
        javaLangNumber.numberMinMaxElapsedCheck();
    }
}
