package designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        // private 접근 제어자로 생성자를 제한했기에 인스턴스 생성 불가능
        // Singleton singleton = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
        System.out.println("singleton3 = " + singleton3);

        // 똑같은 단일 객체를 참조하는 것을 확인할 수 있다.
    }
}
