package designpattern.factorymethod;

public class Driver {
    public static void main(String[] args) {


        // 팩토리 메서드를 보여한 객체들을 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();


        boltBall.identify();
        kittyTower.identify();

    }
}
