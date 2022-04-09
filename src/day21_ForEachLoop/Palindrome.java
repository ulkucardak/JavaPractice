package day21_ForEachLoop;

public class Palindrome {
    public static void main(String[] args) {

        String[] words =   {"anna", "level", "Java"};


        int count = 0;

        for (String word : words) {
            String reversed = "";
            for (int i = word.length()-1; i >=0 ; i--) {
                reversed += word.charAt(i);
            }
            if(word.equalsIgnoreCase(reversed)){
                count += 1;
            }
        }
        System.out.println(count);


    }
}
/*
 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */