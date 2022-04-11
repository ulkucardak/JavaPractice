package day38_MethodOverriding.shapeTask;

public class Circle extends Shape{

    public int radius;
    public static double pi= 3.14;


    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = pi * radius * radius;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * pi * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", Area of Circle = " + area() + '\'' +
                ", Perimeter of Circle ='" + perimeter() + '\'' +

                '}';
    }
}
