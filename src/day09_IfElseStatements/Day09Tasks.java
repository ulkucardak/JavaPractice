package day09_IfElseStatements;

public class Day09Tasks {

    public static void main(String[] args) {
    // 1. Maximum number between two different numbers
        int n1 = 20, n2 = 50;
        if (n1>n2){
            System.out.println(n1 + " is the maximum number");
        }else {
            System.out.println(n2 + " is the maximum number");
        }
        System.out.println("-----------------------");
    // 2. Minimum number between two different numbers

        int a = 15, b= 45;
        if (a<b){
            System.out.println(a + " is the minumum number");
        } else {
            System.out.println(b + " is the minumum number");
        }
        System.out.println("---------------------------");
    // 3. Write a progrm that can check if the person is eligible to buy alcohol

        String name = "Ulku";
        int age = 40;

        if (age>=18){
            System.out.println(name + " is eligible to buy Alcohol");
        }else{
            System.out.println(name + "is not eligible to buy Alcohol");
        }
        System.out.println("---------------------------");
    }
}
/*
    Tasks:
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote
 */