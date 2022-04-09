package day17_While_DoWhile;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String userName = scan.next();
        System.out.println("Please enter your password: ");
        String passWord = scan.next();


        for (int i = 2; i < 4; i++) {
            if(!(userName.equals("Cydeo") && passWord.equals("Cydeo123"))){
                System.out.println("Invalid username or password! Please try again!");
                System.out.println("Please enter your username: ");
                userName = scan.next();
                System.out.println("Please enter your password: ");
                passWord = scan.next();
            }

            if(userName.equals("Cydeo") && passWord.equals("Cydeo123")){
                System.out.println("Logged in.");
                break;
            }

            if(i==3){
                System.err.println("Your account is locked.");
            }

        }

    }
}
/*
  2. You are writing a code for the log-in function of the Cybertek Application,
  assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

 Ask the user to enter their credentials.
If credentials are matched, your program should print "Logged in."
 If the credentials are not matched, the program should allow the user
 to have three attempts to enter correct credentials and if all three attempts are failed,
 then print "Your account is locked."
 */