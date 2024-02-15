package just;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // 1. 변수 b에 변수 a의 값을 복사한다.

        b = 20; // 2. 변수 b에 20을 재할당한다.

        System.out.println("a = " + a); // a = 10
        System.out.println("b = " + b); // b = 20
    }
}
