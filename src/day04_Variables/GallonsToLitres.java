package day04_Variables;

import java.util.Scanner;

public class GallonsToLitres {

    public static void main(String[] args) {
        int gallon = 0;
        double litre = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter liquid volume as gallon unit : ");
        gallon = scan.nextInt();
        litre = gallon * 3.79;
        System.out.println(gallon + " gallon = " + litre + " litres");





    }
}
/*
5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
							1000
							10000
 */