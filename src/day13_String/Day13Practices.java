package day13_String;

import java.util.Scanner;

public class Day13Practices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);

        if (f==l){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }

        System.out.println("-------------------------------");
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        System.out.println(first+ "." + last);

        System.out.println();
    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */