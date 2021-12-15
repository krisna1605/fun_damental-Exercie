class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String namePerson){
        System.out.println("Hello " + namePerson + " My name is " + name);
    }

    String talking(String message){
        return message;
    }

}
