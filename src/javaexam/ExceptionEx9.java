package javaexam;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의 발생");
            throw e;
        } catch (Exception e) {
            System.out.println("e.getMessage() : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("정상 종료");
    }
}
