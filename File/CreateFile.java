
import java.io.File;

public class CreateFile {

    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();

        // File file1 = new File("student.txt");
        // File file2 = new File("teacher.txt");
        File file1 = new File("D:/Programming/JAVA/OOP in JAVA//File/Person/student.txt");
        String path = dir.getAbsolutePath();
        File file2 = new File(path + "/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);

        }

        if (file1.exists()) {
            System.out.println("File1 exist");
        } else {
            System.out.println("File1 not exist");
        }

        // file2.delete();
        // if (file2.exists()) {
        //     System.out.println("File2 exist");
        // } else {
        //     System.out.println("File2 not exist");
        // }
    }

}
