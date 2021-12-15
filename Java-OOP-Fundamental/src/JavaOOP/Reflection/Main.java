package JavaOOP.Reflection;

import JavaOOP.Exception.ValidationUtil;

public class Main {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
//        createUserRequest.setUsername("Test");
//        createUserRequest.setPassword("123");

        ValidationUtil.validationReflection(createUserRequest);

    }
}
