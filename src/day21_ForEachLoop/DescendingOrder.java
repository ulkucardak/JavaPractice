package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 2, 9, 1, 0, 7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] descending = new int[numbers.length];

        for (int i = numbers.length - 1,j = 0; i >= 0; i--, j++) {
            descending[j] = numbers[i];
        }
        System.out.println(Arrays.toString(descending));
    }
}
/*
1. Write a program that sort the array of integer in descending order
 */