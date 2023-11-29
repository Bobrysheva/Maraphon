package day9.Task2;

public class Circle extends Figure {
    double radiuse;

    Circle( double radiuse, String colour) {
        super(colour);
        this.radiuse = radiuse;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.sqrt(radiuse);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.PI * 2 * radiuse;
        return perimeter;
    }
}
