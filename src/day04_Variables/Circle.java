package day04_Variables;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle {

    public static void main(String[] args) {
        double PI = 3.14;
        int radius = 0;
        double area;
        double perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please give radius of circle :");
        radius = scan.nextInt();
        area = radius * radius * PI;
        perimeter = 2 * PI * radius;
        System.out.println("Area of circle :" + area);
        System.out.println("Perimeter of circle :" + perimeter);

    }
}

/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */