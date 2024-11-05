
import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {

            File file = new File("D:/Programming/JAVA/OOP in JAVA/File/Person/student.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String id = scanner.next();
                String name = scanner.next();

                System.out.println("Id: " + id + " Name: " + name);
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
