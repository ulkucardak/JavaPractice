package day28_ArrayList;

import java.util.ArrayList;

public class MultiplyEachNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer each : list) {
            if(each%2!=0){
                list.set(list.indexOf(each),each*2);
            }
        }
        System.out.println(list);


    }
}
/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */