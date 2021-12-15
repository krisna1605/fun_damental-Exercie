package TypeCheck_Cast;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("rudi");
        employee = new Manager("joko");
        employee = new VicePresident("Gerald");

        sayHello(new VicePresident("Eko"));
        sayHello((VicePresident) employee);
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + employee.name);
        }
    }
}
