package JavaOOP.Exception;

import Annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void valid(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.userName() == null) {
            throw new ValidationException(("Username is null"));
        } else if (loginRequest.userName().isBlank()) {
            throw new ValidationException(("Username is Blank"));
        } else if (loginRequest.passWord() == null) {
            throw new ValidationException(("Password is null"));
        } else if (loginRequest.passWord().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void blankValid(LoginRequest loginRequest) {
        if (loginRequest.userName() == null) {
            throw new BlankException(("Username is null"));
        } else if (loginRequest.userName().isBlank()) {
            throw new BlankException(("Username is Blank"));
        } else if (loginRequest.passWord() == null) {
            throw new BlankException(("Password is null"));
        } else if (loginRequest.passWord().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object object) {
        Class xClass = object.getClass();
        Field[] fields = object.getClass().getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                    throw new BlankException("Field " + field.getName() + " is Blank");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa akses : " + field.getName());
                    System.out.println("Pesan Error : " + exception);
                }

            }
        }
    }
}
