package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6},{7,8,9,10}}; // [[1, 2, 3], [4, 5, 6], [7, 8, 9, 10]]
        int[][] reversed = new int[array.length][]; // [[10, 9, 8, 7], [6, 5, 4], [3, 2, 1]]



        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {

            reversed[j] = new int [array[i].length];    // Creating reversed 1D arrays and assigning array's length
        //  reversed [0] =         array [2].length

            for (int k = array[i].length - 1, l=0; k >= 0; k--,l++) { // Getting elements of 1D arrays and assigning
                reversed [j][l] = array[i][k];                         // to reversed array as an element
            //           [0][0] =      [2][3]
            //           [0][1] =      [2][2]
            //           [0][2] =      [2][1]
            //           [0][3] =      [2][0]
            }


        }

        System.out.println(Arrays.deepToString(array));
        System.out.println("----------------------------------------");
        System.out.println(Arrays.deepToString(reversed));


    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */