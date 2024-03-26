package javaexam;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2(80009199L);
        Person2 p2 = new Person2(80009199L);

        if (p1 == p2) {
            System.out.println("p1과 p2는 같다.");
        } else {
            System.out.println("p1과 p2는 다르다");
        }

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같다.");
        } else {
            System.out.println("p1과 p2는 다르다.");
        }
    }
}

class Person2 {
    long id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person2) {
            return id == ((Person2) obj).id;
        } else {
            return false;
        }
    }

    public Person2(long id) {
        this.id = id;
    }
}
