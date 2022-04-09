package day14_String_Methods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Two Different Words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        word1 = word1.replace(word1.charAt(0), ' ');
        word2 = word2.replace(word2.charAt(0), ' ' );

        System.out.println(word1.trim()+word2.trim());



    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */