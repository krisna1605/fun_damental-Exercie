public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Krisna";
        person.address = "Meneteng";
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Budi");
        System.out.println(person.talking("Hello Kawan"));

    }
}
