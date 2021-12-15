package Inheritance.AnimalCase;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog.chew() Called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() Called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() Called");
        move(10);
    }
}
