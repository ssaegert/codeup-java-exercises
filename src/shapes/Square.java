package shapes;

public class Square extends Rectangle {

//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getRecPerimeter() {
//        return side * 4;
//    }
//
//    public double getRecArea() {
//        return side * side;
//    }

    //Cleaner solution

    public Square(double side) {
        super(side, side);
    }

    public double getRecPerimeter() {
        return length * 4;
    }

    public double getRecArea() {
        return length * length;
    }
}
