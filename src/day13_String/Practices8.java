package day13_String;

import java.util.Scanner;

public class Practices8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter username: ");
        String userName = scan.next();
        System.out.println("Please enter password: ");
        String password= scan.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in.");
        }else {
            System.err.println("Incorrect username or password");
        }
    }
}
/*
8. You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched,
        your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */