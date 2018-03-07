package shapes;

public class Square extends Quadrilateral {

//    public Square(double length, double width) {
//        super(length, width);
//    }
        public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

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

//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getRecPerimeter() {
//        return length * 4;
//    }
//
//    public double getRecArea() {
//        return length * length;
//    }
}
