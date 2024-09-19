
public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Ismail", "Male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Elisa", "Female", 1655894667);
        teacher3.displayInformation();
    }
}
