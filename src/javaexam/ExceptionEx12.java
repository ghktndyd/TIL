package javaexam;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1(); // method1()도 예외가 발생할 가능성이 있어서 throws 키워드로 알림.
    }

    static void method1() throws Exception {
        method2(); // method2()를 호출하여서 사용하였기에 역시나 예외 발생
    }

    private static void method2() throws Exception {
        throw new Exception(); // 예외 발생 시킴
    }
}
