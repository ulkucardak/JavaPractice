package day16_ForLoops;

import java.util.Scanner;

public class HowManyPositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 different numbers: ");
        String positives = "";
        String negatives = "";

        for (int i=0; i<5;i++){
            int num = scan.nextInt();
            if (num<0){
                int num1 = num * (-1);
                negatives += num1;
            }
            if(num>0){
                positives += num;
            }
        }
        System.out.println(positives.length()+" positive "+ negatives.length()+ " negative");


    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */