package day14_String_Methods;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        /*System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String email =firstName+"_"+lastName+ "@gmail.com";
        System.out.println(email);

        String email1= email.replace(firstName, lastName );
        String email2 = email1.replace()

        System.out.println(email1);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address (ex: mike_tyson@gmail.com):");
        String email = scan.nextLine();
        scan.close();

        String firstName = email.substring(0,email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@'));
        String email1= lastName+"_"+firstName+ domain;

        System.out.println(email1);









    }
}
/*
7. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

  Write a program that can swap first name with last name in the email (Seperated by an underscore).
  If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */