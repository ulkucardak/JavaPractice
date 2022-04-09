package day24_CustomMethods_ReturnMethod;

public class ReversedString {
    public static void main(String[] args) {
       String str = "level";
       
       String reversedString = reversed(str);
       System.out.println(reversedString);

       boolean isPalindrome = isPalindrome(str);

        System.out.println("Is this string palindrome? " + isPalindrome);
        
    }
    
    public static String reversed (String str){
        String reversed = "";

        for (int i = str.length()-1; i>=0; i--) {
            reversed += str.charAt(i);
            
        }
          return reversed;      
    }

    public static boolean isPalindrome (String word2){

        String reversedWord2 = reversed(word2);

       boolean isPalindrome = reversedWord2.equalsIgnoreCase(word2);
       return isPalindrome;
    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


	4. By using the reverse method above to create another method named isPalindrome
	that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */