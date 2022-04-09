package day09_IfElseStatements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String word = null;

        System.out.println("Please enter your number : ");
        number = scan.nextInt();

        if (number == 0){
            word = "zero";
        }else if (number==1){
            word = "one";
        }else if (number==2){
            word = "two";
        }else if (number==3){
            word = "three";
        } else if (number==4){
            word = "four";
        }else if(number ==5){
            word = "five";
        }else if (number ==6){
            word = "six";
        }else if (number==7){
            word = "seven";
        } else if (number==8){
            word = "eight";
        }else if (number==9){
            word = "nine";
        }else {
            System.out.println("Invalid");
        }
        System.out.println("word = " + word);
    }
}
/*
Create a class called NumberToWord, and write a java program
that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */
