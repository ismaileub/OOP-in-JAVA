
import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File dir = new File("D:/Programming/JAVA/OOP in JAVA//DataBase/person");
        dir.mkdir();

        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());

        if (dir.delete()) {
            System.out.println(dir.getName() + " folder has been deleted");
        }
    }
}
