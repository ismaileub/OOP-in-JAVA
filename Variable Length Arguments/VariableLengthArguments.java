
public class VariableLengthArguments {

    static void add(int... num) {

        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
    }
}
