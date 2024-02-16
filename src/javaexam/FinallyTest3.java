package javaexam;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();

        System.out.println("main 메서드 종료");
    }

    static void method1() {
        try {
            System.out.println("method1() 호출됨.");
            return; // 현재 실행 중인 메서드 종료
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("method1()의 finally 블럭 호출됨.");
        }
    }
}
