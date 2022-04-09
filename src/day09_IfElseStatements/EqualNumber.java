package day09_IfElseStatements;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter n1: ");
        n1 = scan.nextDouble();
        System.out.print("Please enter n2: ");
        n2 = scan.nextDouble();
        System.out.print("Please enter n3: ");
        n3= scan.nextDouble();

        if (n1==n2 && n2==n3){
            System.out.println("All numbers are EQUAL");
        } else if (n1==n2 && n2!=n3){
            System.out.println("n1&n2 are equal");
        } else if (n2==n3 && n1!=n3){
            System.out.println("n2&n3 are equal");
        } else if (n1==n3 && n2!=n3){
            System.out.println("n3&n1 are equal");
        } else if (n1!=n2 && n2!=n3 && n1!=n3){
            System.out.println("none of them are equal");
        }


    }
}
/*
Create a class called EqualNumbers,
and write a program that can check the equality of the three given numberrs

	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */