package day13_String;

import java.util.Scanner;

public class Practices_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        scan.close();


        if (str.equals("")){
            System.out.println("string is empty!");
        }else if (str.length()>3){
            char a = str.charAt(str.length()-1);
            char b = str.charAt(str.length()-2);
            char c = str.charAt(str.length()-3);
            System.out.println("The last three character are "+ "\""+c+b+a+"\"");
        } else if(str.length()<=3){
            System.out.println(str);
        }


    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */