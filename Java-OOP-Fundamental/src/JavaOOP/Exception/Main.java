package JavaOOP.Exception;

public class Main {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,"");

        try {
            ValidationUtil.valid(loginRequest);
        } catch (ValidationException e){
            System.out.println("Terjadi Error Dengan Pesan : " + e.getMessage());
        } finally {
            System.out.println("Harus Selalu dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest("",null);
        ValidationUtil.blankValid(loginRequest2);
    }


}
