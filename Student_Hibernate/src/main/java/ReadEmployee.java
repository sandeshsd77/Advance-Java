import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadEmployee {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sande\\IdeaProjects\\Student_Hibernate\\src\\main\\java\\Application.Propeties");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            System.out.println("url"+properties.getProperty("url"));
            System.out.println("username"+properties.getProperty("usernmae"));
            System.out.println("password"+properties.getProperty("password"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
