package StackTraceElement;

public class Main {
    public static void main(String[] args) {
        try{
            String[] name;
            name = new String[]{"eko", "saya", "Lupa"};
            for (var value : name){
                System.out.println(value);
            }
            System.out.println(name[10]);
        } catch (Throwable message){
            StackTraceElement[] stackTraceElement = message.getStackTrace();
            message.printStackTrace();
        }

    }
}
