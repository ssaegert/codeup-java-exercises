package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getRecArea() {
        return length * width;
    }

    public double getRecPerimeter() {
        return 2 * length + 2 * width;
    }

}
