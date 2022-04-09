package day28_ArrayList;

import java.util.ArrayList;

public class CombineTwoStringArrays {
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0, j=0; i < arr1.length ; i++,j++) {
            list.add(i,arr1[j]);
        }
        for (int i = arr1.length, j=0; i <arr2.length+arr1.length ; i++,j++) {

            list.add(i, arr2[j]);
        }
        System.out.println(list);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */