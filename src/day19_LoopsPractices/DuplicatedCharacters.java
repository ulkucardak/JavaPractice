package day19_LoopsPractices;

import java.util.Scanner;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.next();
        String duplicated = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if ( ch == each){
                    frequency ++;
                }
            }
            if(frequency==2){
                if(duplicated.contains("" +ch)){
                    continue;
                }
                duplicated += ch;
            }
            if(frequency==1){
                if(unique.contains("" +ch)){
                    continue;
                }
                unique += ch;

            }

        }

        System.out.println("First duplicated character is: " +duplicated.charAt(0));
        System.out.println("Index number of first duplicated character is: "+ str.indexOf(duplicated.charAt(0)));
        System.out.println("All duplicated characters are : "+ duplicated);
        System.out.println("First unique characters are: "+ unique.charAt(0));
    }
}
/*
Write a program that can return the first duplicated character from a string
2. Write a program that cna return the index number of the first duplicated character from a string
3. Write a program that can display all the characters that appeared twice in the string.
4. Write a program that can return the index number of the first unique character.
 */