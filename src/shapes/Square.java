package shapes;

public class Square extends Quadrilateral{

    public Square(double side){
        super(side,side);
    }
    @Override
    public double getPerimeter() {
        double side =length;
        return 4 * side;
    }

    @Override
    public double getArea() {
        double side = length;
        return side * side;
    }

    @Override
    public void setWidth(double side) {
       this.width = side;
       this.length = side;
    }

    @Override
    public void setLength(double side) {
       setWidth(side);
    }
    //    private int side;
// public Square(double side){
//     super(side,side);
// }
// public double getArea(){
//     return length * width;
// }
// public double getPerimeter(){
//
// }
//    public Square(int side){
//        super(side,side);
//        this.side =side;
//    }
//    public int getArea(){
//        System.out.println("This is the square solution");
//        return side* side;
//    }
//
//    public int getPerimeter(){
//        System.out.println("This is the square solution");
//        return 4 * side;
//    }

    //My first approach
//    int side = length;
//    int side = width;
//        System.out.println("The perimeter of the square is " + getPerimeter(length,width));
//        return getPerimeter(length,width);
//    }
}
