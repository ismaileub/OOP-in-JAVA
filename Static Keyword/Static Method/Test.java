
public class Test {

    public static void main(String[] args) {

        // Creating an instance of the StaticMethod class to call non-static methods
        StaticMethod obj = new StaticMethod();
        obj.display1(); // Calling the non-static method using the object instance

        // Calling the static method directly using the class name
        StaticMethod.display2();

    }

}
