
public class Student {

    String name;        //instance variable
    int id;
    static String universityName = "EUB";

    public Student(String n, int i) {
        name = n;
        id = i;

    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + universityName);
        System.out.println();
    }

}
