package day13_String;

import java.util.Scanner;

public class Practices7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 different word: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int w1 = word1.length(), w2 = word2.length(), w3 = word3.length();

        if (w1==w2 && w1==w3 && w2==w3){
            System.out.println("All words are same length");
        }else if ( w1==w2 || w1==w3 || w2==w3){
            System.out.println("Not Same nor Different lengths");
        }else if (w1!=w2 && w1!=w3 && w2!=w3){
            System.out.println("All different length");
        }
    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */