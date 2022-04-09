package day33_Static;

import java.util.Arrays;

public class CircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
        Circle.printPi();



        Circle circle2 = new Circle(5);
        System.out.println(circle2.calcArea());
        System.out.println(circle2.calcPerimeter());
        Circle.printPi();



        Circle[] circles = {circle1,circle2};

        System.out.println(Arrays.toString(circles));

    }
}
