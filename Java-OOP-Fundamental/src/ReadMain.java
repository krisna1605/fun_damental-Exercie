import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMain {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("Person.java")
            );
            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error nya : " + throwable.getMessage());
        } finally {
            if (bufferedReader != null) {

                try {
                    bufferedReader.close();
                } catch (IOException exception) {
                    System.out.println("Error : " + exception.getMessage());
                } finally {

                }
            }
        }
    }
}

