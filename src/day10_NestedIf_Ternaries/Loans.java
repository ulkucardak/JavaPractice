package day10_NestedIf_Ternaries;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your salary: ");
        int salary = scan.nextInt();
        System.out.println("Please Enter your Credit Score: ");
        double creditScore = scan.nextDouble();


        String result = (salary>60000 && creditScore>650)?"Loan Approved" : "Loan Denied";
        System.out.println(result);

    }
}
/*
6. Create a class called Loans, Given two variables salary and credit score,
use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */