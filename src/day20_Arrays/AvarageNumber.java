package day20_Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int sizeOfArray= scan.nextInt();

        int [] numbers = new int [sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        System.out.println("numbers = "+ Arrays.toString(numbers));

        int sum = numbers[0];
        for (int i = 0; i < sizeOfArray; i++) {
            sum += numbers[i];
        }
        int avarage = sum / sizeOfArray;
        System.out.println("avarage = " + avarage);


    }
}
/*

	4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */