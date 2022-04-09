package day24_CustomMethods_ReturnMethod;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        int [] reversedArray = reversedArray(numbers);

        System.out.println(Arrays.toString(reversedArray));

    }

    public static int [] reversedArray(int [] array){
        int [] reversedArray = new int [array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reversedArray [j] = array [i];
        }
        return reversedArray;
    }
}
/*
4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */