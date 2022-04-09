package day16_ForLoops;

import java.util.Scanner;

public class CatDog2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        String word1 = "Cat";
        String word2 = "Dog";

        int freOfCat = 0;
        int freOfDog = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                freOfCat += 1;
            }
        }
        for (int i = 0; i <= sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 3).equalsIgnoreCase("dog")) {
                freOfDog += 1;
            }
        }
        boolean ısCatDogSameFreq = freOfCat == freOfDog;
        System.out.println(ısCatDogSameFreq);
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


