package Inheritance;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Santoso";
        manager.sayHello("Budi");

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Iko";
        vicePresident.sayHello("Uwais");
    }
}
