package day9.Task2;

public class Rectangle extends Figure {
    double high;
    double width;

    Rectangle (double high, double width, String colour) {
        super(colour);
        this.high = high;
        this.width = width;
    }
    public double area(){
        double area = high*width;
        return  area;
    }
    public double perimeter() {
        double perimeter = (high+width)*2;
        return perimeter;
    }
}
