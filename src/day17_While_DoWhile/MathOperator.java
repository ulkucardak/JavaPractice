package day17_While_DoWhile;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter  second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter your operator: ");
        char operator = scan.next().charAt(0);
        int result = 0;

        while (!(operator== '+' || operator=='-' || operator=='*' || operator=='/')){
            System.out.println("Please re-enter the operator: ");
            operator = scan.next().charAt(0);
        }

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result= num1-num2;
                break;
            case '*':
                result= num1 *num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                break;
        }

        System.out.println("result = " + result);

    }
}
/*
 3. write a program to ask user to enter two number
 and math operator, and return the result.

if the operator is invalid operator, ask user to re-enter the operator
until user provides a valid operator (+, -, *, /)
 */