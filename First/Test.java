
public class Test {

    public static void main(String[] args) {

        Teacher teacher1;   //object declare
        teacher1 = new Teacher();  // object  create

        Teacher teacher2 = new Teacher();  //declare and create

        teacher1.name = "Anisul Islam";
        teacher1.gender = "Male";
        teacher1.phone = 186649897;

        System.out.println("Name:" + teacher1.name);
        System.out.println("Gender:" + teacher1.gender);
        System.out.println("Phone:" + teacher1.phone);

        teacher1.setInformation("Anisul Islam", "Male", 186649897);

        teacher1.displayInformation();

    }

}
