package Inheritance.AnimalCase;

public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name= " + getName() +
                "gills=" + gills +
                ", fins=" + fins +
                '}';
    }

    public void status(){

    }

    public String rest(){
        return "Fish is rest";
    }
    private void moveMuscles(){
        System.out.println("Move Muscles");
    }
    private void moveBackFins(){
        System.out.println("Move Back Fins");
    }
    private void swim(int speed){
        moveMuscles();
        moveBackFins();
        super.move(speed);
    }
}
