package shapes;

public class Square extends Rectangle{
    private int side;

    public Square(int side){
        super(side,side);
        this.side =side;
    }
    public int getArea(){
        System.out.println("This is the square solution");
        return side* side;
    }

    public int getPerimeter(){
        System.out.println("This is the square solution");
        return 4 * side;
    }
//    int side = length;
//    int side = width;
//        System.out.println("The perimeter of the square is " + getPerimeter(length,width));
//        return getPerimeter(length,width);
//    }
}
