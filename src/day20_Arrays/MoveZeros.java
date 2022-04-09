package day20_Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5, 0, 1, 0};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int[] reversed = new int[6];

        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {

            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */