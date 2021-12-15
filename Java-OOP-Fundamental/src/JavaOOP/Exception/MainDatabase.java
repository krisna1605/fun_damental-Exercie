package JavaOOP.Exception;

public class MainDatabase {
    public static void main(String[] args) {
        connectDatabase(null,"test");
    }

    public static void connectDatabase(String userName, String passWord) {
        if (userName == null | passWord == null) {
            throw new DatabaseError("Error");
        }
    }
}
