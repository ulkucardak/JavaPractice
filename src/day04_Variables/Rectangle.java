package day04_Variables;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please give length of rectangle:");
        int length= scan.nextInt();

        System.out.print("Please give width of rectangle:");
        int width= scan.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle =" + area);
        System.out.println("Perimeter of rectangle =" + perimeter);

    }

}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */