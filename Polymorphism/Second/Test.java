
public class Test {

    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = new Rectangle(4.00, 5.00);
        s[1] = new Triangle(3.00, 4.00);
        // Shape s1 = new Shape();
        // Shape s2 = new Rectangle(4.00, 5.00);
        // Shape s3 = new Triangle(3.00, 4.00);
        // System.out.println(s2.area());
        // System.out.println(s3.area());

        System.out.println(s[0].area());
        System.out.println(s[1].area());
    }
}
