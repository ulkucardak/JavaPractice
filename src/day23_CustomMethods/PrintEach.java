package day23_CustomMethods;

public class PrintEach {
    public static void main(String[] args) {
        printEachChar("Cydeo");

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        printEachElement(numbers);

    }

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ ", ");
        }
        System.out.println();


    }

    public static void printEachElement (int[] array){

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
/*
13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array
 */