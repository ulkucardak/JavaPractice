package day16_ForLoops;

import java.util.Scanner;

public class WithoutMultiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two positive numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int multiplication = 0;
        scan.close();

        if(num1>0 && num2>0){

            for (int i = 0; i < num2; i++) {
                multiplication += num1;

            }

        }else{
            System.out.println("Invalid Number!");
        }

        System.out.println("multiplication = " + multiplication);
    }
}
/*

3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */