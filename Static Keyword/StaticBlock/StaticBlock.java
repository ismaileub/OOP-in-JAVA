
public class StaticBlock {

    static int id;
    static String Name;

    // Static block to initialize static variables
    static {
        id = 101;
        Name = "Ismail";
    }

    static void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + Name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }
}
