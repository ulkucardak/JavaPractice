package day04_Variables;

import java.util.Scanner;

public class KgToPounds {
    public static void main(String[] args) {
        int kg = 0;
        double pounds = 0.0;
        double converted = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please give a number as a kg : ");
        kg = scan.nextInt();
        converted = kg * 2.2;
        System.out.println(kg + " kg = " + converted + " pounds");

    }
}


/*
4. Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
					Hints: 1 kg = 2.2 pounds
 */