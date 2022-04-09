package day28_ArrayList;

import java.util.ArrayList;

public class FirstDuplicated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        Integer firstDuplicated = firstDuplicated(list);
        System.out.println("firstDuplicated = " + firstDuplicated);

    }

    public static Integer firstDuplicated (ArrayList<Integer> list){
        Integer firstDuplicated = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i+1)) ){
                firstDuplicated = list.get(i);
                break;
            }
        }
      return firstDuplicated;

    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */