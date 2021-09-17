package shapes;

public class ShapesTest {
    public static void main(String[] args) {
       Measurable myShape = new Rectangle(5,4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

       myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


    }
}
