package day04_Variables;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        System.out.println("Please write length of square side:");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int area= a * a;
        int perimeter= 4 * a;

        System.out.println(area);
        System.out.println(perimeter);


    }




}

/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side

						area = side * side;
						perimeter = 4 * side
 */