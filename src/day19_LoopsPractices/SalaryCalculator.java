package day19_LoopsPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlySalary = 0;
        int  hoursWeekly = 0;
        double grossSalary = hourlySalary * hoursWeekly;
        double federalTaxRate = 0.26;
        double stateTaxRate = 0;
        double totalTax = grossSalary * federalTaxRate + grossSalary * stateTaxRate;
        double netIncome = grossSalary - totalTax;

        while(true){
            System.out.println("How much you make an hour?");
            hourlySalary = scan.nextDouble();
            if(hourlySalary<=0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            hoursWeekly = scan.nextInt();
            if(hoursWeekly<1 && hourlySalary>144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            stateTaxRate = scan.nextDouble();
            if(stateTaxRate<0 || stateTaxRate>0.10){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            grossSalary = hourlySalary * hoursWeekly;
            totalTax = grossSalary * federalTaxRate + grossSalary * stateTaxRate;
            netIncome = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("FederalTax = " + grossSalary * federalTaxRate);
            System.out.println("StateTax = " +  grossSalary * stateTaxRate);
            System.out.println("TotalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            if(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }

        }


    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program
					after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144,
					terminate the program after displaying the error message "Invalid Entry
					for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%,
					terminate the program after displaying the error message
					"Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying
				the error message "Invalid Entry"
 */