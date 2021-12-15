import java.io.BufferedReader;
import java.io.FileReader;

public class ReadWithresource {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error nya : " + throwable.getMessage());
        }
    }
}
