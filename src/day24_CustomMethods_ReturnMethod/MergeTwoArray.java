package day24_CustomMethods_ReturnMethod;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

       int [] arr1 = {1,2,3};
       int [] arr2 = {4,5,6,7,8,9,10};

       int [] mergedArray = mergedArray(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray));

    }

    public static int [] mergedArray (int [] arr1, int [] arr2){

        int [] mergedArray = new int [arr1.length + arr2.length];

        for (int i = 0, j = 0; i < arr1.length; i++,j++) {

            mergedArray [j] = arr1 [i];
        }
        for (int i = 0, j =arr1.length ; i < arr2.length; i++,j++) {
            mergedArray [j] = arr2[i];

        }



        return mergedArray;

    }
}
/*
5. create a method that can merge two arrays and return the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}
 */