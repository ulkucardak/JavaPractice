package day14_String_Methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter two different word: ");
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();

        /*if (word1.charAt(word1.length()-1)== word2.charAt(0)){
            System.out.println(word1+ word2.replace(word2.charAt(0), ' ').trim());
        }*/
        if (word1.charAt(word1.length()-1)== word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }
    }
}
/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */