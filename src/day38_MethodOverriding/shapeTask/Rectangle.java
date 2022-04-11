package day38_MethodOverriding.shapeTask;

public class Rectangle extends Shape{

    public int width;
    public int length;

    public Rectangle( int width, int length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width+ length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", width=" + width + '\''+
                ", length=" + length + '\''+
                ", Area of Square = " + area() + '\'' +
                ", Perimeter of Square ='" + perimeter() + '\'' +

                '}';
    }
}
