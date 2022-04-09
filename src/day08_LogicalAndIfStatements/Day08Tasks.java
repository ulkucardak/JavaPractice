package day08_LogicalAndIfStatements;

public class Day08Tasks {

    public static void main(String[] args) {
            String name = "Ulku";
            byte age = 16;
            boolean isEligible = age >= 18;

            if (isEligible) {
                System.out.println(name + " is eligible to buy cigarette");
            }
            if (!isEligible) {
                System.out.println(name + " is not eligible to buy cigarette");
            }
            System.out.println("--------------------------------------");

            byte gradeLevel = 4;
            boolean isElementary = gradeLevel>=1 && gradeLevel<=5;
            boolean isMiddle = gradeLevel>=6 && gradeLevel<=8;
            boolean isHigh = gradeLevel>=9 && gradeLevel<=12;
            boolean isCollage = gradeLevel>=13 && gradeLevel<=16;
            boolean isGradSchool = gradeLevel>=17 && gradeLevel<=18;

             if(isElementary) {
                 System.out.println("1-5: Elementary School");
             }
            if(isMiddle) {
            System.out.println("6-8: Middle School");
            }
            if(isHigh) {
            System.out.println("9-12: High School");
            }
            if(isCollage) {
            System.out.println("13-16: Collage");
            }
            if(isGradSchool) {
            System.out.println("17-18: Grad School");
        }
        System.out.println("--------------------------------");

            int num1 = 500, num2 = 500;
            boolean isMaxNum2 = num2>num1;
            boolean isEqual = num1==num2;

            if (isMaxNum2) {
                System.out.println(num2 + " is maximum number");
            }
            if (!isMaxNum2){
                System.out.println(num1 + " is maximum number");
            }
            if (isEqual){
                System.out.println(num1 + " and " + num2 + " are equal");
            }
    }
}

/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18

	3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */