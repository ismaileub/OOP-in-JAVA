
public class B extends A {

    //int x=10;
    int x = 5;

    B() {
        super();
        System.out.println("B's constructor");
        //super();   error constructor should call first 
    }

    @Override
    void display() {
        super.display();
        System.out.println(super.x);

        System.out.print("Inside the sub class ");
        System.out.println(x);
    }
}
