package day14_String_Methods;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address with your name(ulku_cardak@apple.com):");
        String email = scan.nextLine();
        scan.close();

        /*String firstName = email.substring(0,email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@'));

        String firstName1 = firstName.toUpperCase();
        String firstName2 = firstName.replace(firstName.charAt(0), firstName1.charAt(0));

        String lastName1 = lastName.toUpperCase();
        String lastName2 = lastName.replace(lastName.charAt(0), lastName1.charAt(0));

        System.out.println("First name: "+firstName2);
        System.out.println("Last name: "+lastName2);

        System.out.println("Domain:"+domain.substring(1, domain.indexOf('.')));

         */

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf('_')).toLowerCase();
        String lastName = email.substring(email.indexOf('_')+1,email.indexOf('_')+2).toUpperCase() + email.substring(email.indexOf('_')+2, email.indexOf('@')).toLowerCase();
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf('.')).toLowerCase();

        System.out.println("First name: "+firstName+ "\nLast name: "+ lastName+"\nDomain: "+domain);
    }
}
/*
8. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

  Write a program that will print out information about user based on email. Print first name, last name, and domain.

  First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */