package day20_Arrays;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char eachCharacter = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if(eachCharacter==str.charAt(j)){
                    System.out.println(eachCharacter);
                    System.exit(0);
                }

            }

        }

        scan.close();
    }
}
