package day18_NestedLoops;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
       String str = "aabccdeef";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
         int frequency = 0;
            char ch1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    frequency += 1;
                }
            }
            if (frequency ==1) {
             result += ch1;
            }

        }
        System.out.println(result);

      /* String word="";
        System.out.println("Enter a string:");
        String str=new Scanner(System.in).nextLine();
        for (int i = 0; i < str.length() ; i++) {
            int freq=0;
            for (int j = 0; j < str.length() ; j++) {
                if((str.charAt(i)==str.charAt(j))){
                    freq++;
                }
            }
            if(freq==1){
                word+=str.charAt(i);
            }
        }
        System.out.println(word);*/



/*
5. Write a program that can find the unique characters from a string without using index()
and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

Hint: if you find out how to find the frequency of one character,
then you can repeat it for the remaining characters to find the frequency.
if frequency of a character == 1  =========> unique
 */
    }
}