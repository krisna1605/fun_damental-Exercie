package JavaOOP.Exception;

public class LoginRequest {
    private String userName;
    private String passWord;

    public LoginRequest(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String userName() {
        return userName;
    }

    public String passWord(){
        return passWord;
    }
}
