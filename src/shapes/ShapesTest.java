package shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape = new Rectangle(5, 4);
        System.out.println("Rectangle");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Square(5);
        System.out.println("\nRectangle");
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        Square box2 = new Square(5);
//
////        Square d = new Square(4);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

//        System.out.println(d.getRecPerimeter());


    }

}
