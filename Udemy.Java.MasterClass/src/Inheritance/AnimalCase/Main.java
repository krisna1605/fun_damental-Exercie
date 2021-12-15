package Inheritance.AnimalCase;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Barkie", 8, 20, 2, 4, 1, 20, "Long Silky");
//        dog.eat();
//        dog.walk();
//        dog.run();
        Fish fish = new Fish("Nemo",1,8,2,4);
        fish.eat();
        fish.move(8);
        System.out.println(fish.rest());
        System.out.println(fish.toString());
    }

}
