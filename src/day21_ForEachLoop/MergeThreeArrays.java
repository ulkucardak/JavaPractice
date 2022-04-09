package day21_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {

       int[] arr1 = {30, 10, 20};
       int[] arr2 = {15, 40, 25, 35};
       int[] arr3 = {8, 9, 17, 5, 4, 1};

       int[] numbers = new int[arr1.length + arr2.length + arr3.length];

       int i = 0;
        for (int num1 : arr1) {
            numbers[i] = num1;
            i++;
        }
        for (int num2 : arr2) {
            numbers[i] = num2;
            i++;
        }
        for (int num3 : arr3) {
            numbers[i] = num3;
            i++;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
/*
 5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */