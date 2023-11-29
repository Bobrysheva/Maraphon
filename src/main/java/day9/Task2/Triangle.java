package day9.Task2;

public class Triangle extends Figure {
    double line1;
    double line2;
    double line3;

    Triangle(double line1, double line2, double line3, String colour) {
        super(colour);
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public double perimeter() {
        double perimeter = line1 + line2 + line3;
        return perimeter;
    }

    public double area() {
        double p = perimeter() / 2;
        double area = Math.sqrt(p * (p - line1) * (p - line2) * (p - line3));
        return area;
    }
}

