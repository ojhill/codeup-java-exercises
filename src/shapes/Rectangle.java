package shapes;

public class Rectangle extends Quadrilateral{
   public Rectangle(double length, double width){
       super(length, width);
   }
    @Override
    public double getPerimeter() {
        return (length * 2)+(width*2);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
}

//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public Rectangle(int length, int width){
//    this.length = length;
//    this.width = width;
//}
//
//    public int getArea(){
//    return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//    return ((2 * this.length) + (2 * this.width));
//    }


  //My first approach
    //    public int getPerimeter(int length, int width){
//       int perimeter = 2 * length + 2 * width;
//        System.out.println("The perimeter is " + perimeter);
//        return perimeter;
//    }
//
//    public int getArea(int length, int width) {
//        int area = length * width;
//        System.out.println("The area is " + area);
//        return area;
//    }




