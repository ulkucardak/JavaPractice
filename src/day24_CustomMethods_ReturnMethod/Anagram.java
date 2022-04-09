package day24_CustomMethods_ReturnMethod;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

       String str1 = "listen";
       String str2 = "slient";

       boolean isAnagram = isAnagram(str1, str2);

        System.out.println("Are two words anagram? = " + isAnagram);

    }

    public static boolean isAnagram (String word1, String word2){

        char [] ch1 = word1.toCharArray();
        Arrays.sort(ch1);
        char [] ch2 = word2.toCharArray();
        Arrays.sort(ch2);

        boolean isAnagram = Arrays.equals(ch1, ch2);

        return isAnagram;
    }
}
/*
 2. create a method named isAnagram that passes two String parameters, the method returns true
 if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */