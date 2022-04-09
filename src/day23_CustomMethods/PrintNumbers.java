package day23_CustomMethods;

public class PrintNumbers {
    public static void main(String[] args) {

        oddNumbers();
        evenNumbers();


    }

    // create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i++) {
            if(i%2 != 0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }

    public static void evenNumbers(){

        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }

}




/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by
 */