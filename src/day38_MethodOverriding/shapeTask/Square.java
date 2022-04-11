package day38_MethodOverriding.shapeTask;

public class Square extends Shape {

    public int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;

    }

    @Override
    public double perimeter() {
    return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side + '\'' +
                ", Area of Square = " + area() + '\'' +
                ", Perimeter of Square ='" + perimeter() + '\'' +
                '}';
    }
}
