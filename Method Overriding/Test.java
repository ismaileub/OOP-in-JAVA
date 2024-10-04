
public class Test {

    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name = "Anis";
        t.age = 27;
        t.qualification = "Msc in CSE";
        t.displayInformation();

        System.out.println();

        Person p = new Person();
        p.name = "Ismail";
        p.age = 22;
        p.displayInformation();
    }
}
