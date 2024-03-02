package designpattern.factorymethod;

public class Cat extends Animal {

    @Override
    public AnimalToy getToy() {
        return new CatToy();
    }
}
