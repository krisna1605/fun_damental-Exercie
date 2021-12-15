package AnonymousClass;

import Annotation.Fancy;

@Fancy(name = "Anonymous")
public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Test");
            }
        };
        helloWorld.sayHello();
    }
}
