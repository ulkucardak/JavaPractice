package day20_Arrays;

import javax.swing.*;
import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] reversed = new int[5];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */