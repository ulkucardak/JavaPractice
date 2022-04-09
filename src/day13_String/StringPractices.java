package day13_String;

import java.util.Scanner;

public class StringPractices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Please enter a sentence: ");
        String sentence = scan.nextLine();

        char firstChar = sentence.charAt(0);
        System.out.println(firstChar);
        char lastChar= sentence.charAt(sentence.length() - 1);
        System.out.println(lastChar);

        System.out.println("---------------------------------------"); */

        System.out.println("Enter a word:");
        String word1 = scan.next();
        System.out.println("Enter a second word: ");
        String word2 = scan.next();

        int w1 = word1.length();
        int w2 = word2.length();

        if ( w1>w2){
            System.out.println("The long word is : "+ word1);
        }else{
            System.out.println("The long word is : "+word2);
        }
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

2. write a program that asks user to enter two strings, and print out the longest string



 */