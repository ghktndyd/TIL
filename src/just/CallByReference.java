package just;

public class CallByReference {
    public static void main(String[] args) {
        Animal animal_A = new Animal(); // Aniaml 타입의 animal_A를 생성
        Animal animal_B = animal_A; // Animal 타입의 animal_B를 생성하고 animal_A를 대입

        animal_A.age = 10; // A의 나이를 10으로 설정
        animal_B.age = 20; // B의 나이를 20으로 설정

        System.out.println("animal_A.age = " + animal_A.age); // animal_A.age = 20
        System.out.println("animal_B.age = " + animal_B.age); // animal_B.age = 20

    }
}

class Animal {
    public int age;
}
