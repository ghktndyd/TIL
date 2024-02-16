package javaexam;

public class SuperTest {
    public static void main(String[] args) {
        Child child = new Child();

        child.method();
    }
}

class Parent {
    int x = 20;
}

class Child extends Parent {
    int x = 10;

    void method() {
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
