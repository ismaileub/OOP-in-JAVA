
public class StaticMethod {

    double n = Math.ceil(-5.6);
    Object x = n;

    void display1() {
        System.out.println("I am non static method");
        System.out.println(n);

        System.out.println(x.getClass().getSimpleName());

    }

    static void display2() {
        System.out.println("I am  static method");

    }

}
