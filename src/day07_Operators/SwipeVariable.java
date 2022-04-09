package day07_Operators;

public class SwipeVariable {

    public static void main(String[] args) {
        /*int a = 10;
        int b = 15;
        int c = a;
        int d = b;
        b = c;
        a = d;

        System.out.println("b = " + b);
        System.out.println("a = " + a); */


        int a = 10, b= 15, temp;
        temp = a;
        a= b;
        b= temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
/*
1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */