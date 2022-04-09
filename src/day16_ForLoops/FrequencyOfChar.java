package day16_ForLoops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String str = scan.nextLine();
        System.out.println("Please enter your character:");
        String ch = scan.next();
        int frequency = 0;

        for (int i=0; i<str.length(); i++) {
            String ch1 = ""+ str.charAt(i);

            if(ch.equalsIgnoreCase(ch1)){
                frequency += 1;
            }
        }
        System.out.println(frequency);
    }
}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */