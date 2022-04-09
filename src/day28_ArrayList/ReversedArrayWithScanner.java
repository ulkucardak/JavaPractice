package day28_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArrayWithScanner {
    public static void main(String[] args) {
        int [] array = new int [5];
        reversedArray(array);


    }
    public static void reversedArray (int [] array){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integer array elements:");

        int [] reversedArray = new int [array.length];

        for (int i = 0,j = array.length-1; i < array.length; i++, j--) {
            array [i] = scan.nextInt();
            reversedArray [j] = array [i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }
}
/*
Please create a method (reverseArray) which asks user to enter int array elements
and print by keeping insertion order and reverse order as well...
 */