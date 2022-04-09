package day14_String_Methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a word: ");
        String word = scan.next();

        if ( word.startsWith("x")){
            System.out.println(word.replace('x', ' ').trim());
        }



    }
}
/*
 3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */