package day17_While_DoWhile;

import java.util.Scanner;

public class DivisionMultiplication_InterQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        int multiplication = 0;
        int division = 0;

        if(num1<0 || num2<0){
            System.out.println("Invalid number! Please give a positive number!");
        } else{
            for (int i = 0; i < num2; i++) {
                multiplication += num1;

            }
            System.out.println("multiplication = " + multiplication);

            while (num1!=0){
                num1 -= num2;
                division +=1;
            }
            System.out.println("division = " + division);



        }


    }
}
/*
1. Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */