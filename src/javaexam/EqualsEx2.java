package javaexam;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(80009199L);
        Person p2 = new Person(80009199L);

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

class Person {
    long id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    public Person(long id) {
        this.id = id;
    }
}
