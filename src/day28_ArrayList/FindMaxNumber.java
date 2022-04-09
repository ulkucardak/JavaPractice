package day28_ArrayList;

import java.util.ArrayList;

public class FindMaxNumber {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer maxNumber = 0;

        for (Integer each : list) {
            
            if(each>maxNumber){
                maxNumber=each;
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */