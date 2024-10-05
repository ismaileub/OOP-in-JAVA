
public class University {

    final String uni_name = "EUB";
    final int fees;
    static final String dept;

    public University() {
        this.fees = 37000;
    }

    static {
        dept = "CSE";
    }

    void display() {
        System.out.println("University name: " + uni_name);
        System.out.println("Fees: " + fees);
        System.out.println("Department: " + dept);
    }

}
