package day20_Arrays;

import java.util.Arrays;

public class NumbersOneToHundred {

    public static void main(String[] args) {

        int [] numbers = new int [100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------");

        for (int i = 0,k=100; i < numbers.length; i++,k--) {
            numbers[i]= k;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

/*
1. create an array that has the numbers 1 to 100
	2. create an array that has the numbers 100 to 1
 */
