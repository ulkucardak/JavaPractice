package day16_ForLoops;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("Please enter two different words: ");
        String word1 = scan.next();
        String word2 = scan.next();

        int frequency1 = 0;
        int frequency2 = 0;

        for (int i=0; i<=sentence.length()-word1.length(); i++){
            if (sentence.substring(i, i+word1.length()).equalsIgnoreCase(word1)){
                frequency1 += 1;
            }
        }
        for (int i=0; i<=sentence.length()-word2.length(); i++){
            if (sentence.substring(i, i+word2.length()).equalsIgnoreCase(word2)){
                frequency2 += 1;
            }
        }
            if(frequency1==frequency2){
                System.out.println("true");
            }


    }
}
/*
5. write a program to print true if the string "cat" and "dog"
appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */