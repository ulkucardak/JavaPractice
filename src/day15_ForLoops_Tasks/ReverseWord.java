package day15_ForLoops_Tasks;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.nextLine();
        int lastIndex = word.length()-1;

        /*for(int i = lastIndex; i>=0; i--){
            System.out.print(word.charAt(i));
        }*/

        String result = "";

        for ( int i = word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        System.out.println(result);


    }
}
/*

	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */