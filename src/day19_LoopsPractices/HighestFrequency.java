package day19_LoopsPractices;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.next();
        int count=0;
        int max = 0;
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch==each){
                    frequency += 1;
                }
            }
            if(result.contains("" +ch)){
                continue;
            }
            result += "" + ch;
            result += frequency;

            if(frequency>max){
                max = frequency;

            }

        }

        System.out.println("Frequency of each char: " +result);
        System.out.println("Highest frequency is: "+ max);

    }
}
/*
6.  Write a program that can find the character that has the highest frequency from a string
 */