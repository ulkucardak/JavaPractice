package day15_ForLoops_Tasks;

import java.util.Scanner;

public class FirstLastNameWithString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();

        firstName = firstName.toUpperCase().substring(0,1) + firstName.substring(1).toLowerCase();
        lastName = lastName.toUpperCase().substring(0,1) + lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+ lastName);





    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */