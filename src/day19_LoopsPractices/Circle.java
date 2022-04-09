package day19_LoopsPractices;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = 0;
        double diameter = 0;
        double area = 0;
        double perimeter =0;
        String answer = "";

        do {
            System.out.println("Enter the radius of the circle:");
            r = scan.nextInt();
            diameter = 2 * r;
            area = 3.14 * r * r;
            perimeter = 2 * 3.14 * r;
            if(r<=0){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("Diameter of circle: "+ diameter);
            System.out.println("Area of circle: "+ area);
            System.out.println("Perimeter of circle: "+ perimeter);
            System.out.println("Would you like to calculate another circle?");
            answer = scan.next().toLowerCase();

                while(!(answer.equals("yes") || answer.equals("no"))){
                    System.out.println("Please re-enter your answer: ");
                    answer = scan.next().toLowerCase();
                }

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }while (answer.equals("yes"));


    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after
				displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

	If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */