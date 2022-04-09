package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int sum = 0;

        while (!(num1 < 0 || num2 < 0)) {
            System.out.println("Please enter a number: ");
            num1 = scan.nextInt();
            System.out.println("Please enter second number: ");
            num2 = scan.nextInt();

            if(num1<0 || num2<0){
                break;
            }
            sum = num1 + num2;
            System.out.println("sum = " + sum);
        }
        System.out.println("Invalid number! Please try again!");
        System.out.println("Please enter a number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scan.nextInt();
    }
}
/*
	2. Write a program that calculates the sum of numbers entered by the user
	until user enters a negative number.

            hint: you need an infinite loop
 */