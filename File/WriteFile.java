
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {

        String id, name;
        try {
            Scanner input = new Scanner(System.in);

            Formatter formatter = new Formatter("D:/Programming/JAVA/OOP in JAVA/File/Person/student.txt");

            System.out.print("How many student: ");

            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println("Enter Id and Name:");
                id = input.next();
                name = input.next();

                formatter.format("%s %s\r\n", id, name);
            }

            // formatter.format("%s %s\r\n", "102", "Nirob");
            // formatter.format("%s %s\r\n", "103", "Yasir");
            formatter.close();
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
    }

}
