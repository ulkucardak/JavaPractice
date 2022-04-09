package day14_String_Methods;

import java.util.Scanner;

public class Task5_AsciiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();
        scan.close();
        char a = word.charAt(0);

        if (a>=48 && a<=57){
            System.out.println("first character is digit");
        }else if(a>=65 && a<=90){
            System.out.println("first character is uppercase letter");
        }else if (a>=97 && a<=122){
            System.out.println("first character is lowercase letter");
        }else {
            System.out.println("first character is special character");
        }

    }
}
/*

    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */