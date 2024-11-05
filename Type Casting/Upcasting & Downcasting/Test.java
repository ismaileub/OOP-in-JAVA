
public class Test {

    public static void main(String[] args) {
        Person p = new Teacher();
        p.display();

        Teacher t = (Teacher) new Person();  //run time error
        t.display();

    }
}
