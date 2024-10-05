
public class Rectangle extends Shape {

    double lenght, width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;

    }

    double area() {
        return lenght * width;
    }

}
