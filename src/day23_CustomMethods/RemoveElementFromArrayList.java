package day23_CustomMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            list.add(scan.nextDouble());
            
        }
        System.out.println(list);
        System.out.println("--------------------------------");

        System.out.println(removeElement(list,1));
    }


    public static ArrayList<Double> removeElement(ArrayList<Double>list, int index){
        ArrayList<Double>newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if(i!=index){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
/*
The next ArrayList method we are going to learn is .remove()

The .remove(i) method will remove the element at index i. This means that all elements after index i will be shifted back to fill the hole left by the removal.

Task: Finish the test method that will remove the first two elements in the given ArrayList of doubles (be careful, this is a little tricky!)

Example: Say you had an ArrayList called nums with values (6,2,3,1,9,2,5).

nums.remove(1);
will result in (6,3,1,9,2,5).
nums.remove(3);
nums.remove(3);

will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the second remove(3) will remove the 2, leaving the 5.
 */