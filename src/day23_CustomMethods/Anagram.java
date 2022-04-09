package day23_CustomMethods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("listen","silen");


    }
    public static void isAnagram (String word1, String word2){

        char [] word11 = word1.toCharArray();
        Arrays.sort(word11);
        char [] word22 = word2.toCharArray();
        Arrays.sort(word22);

        boolean anagram = Arrays.equals(word11,word22);

        if(anagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
/*
    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */