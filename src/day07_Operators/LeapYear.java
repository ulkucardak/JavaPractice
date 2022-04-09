package day07_Operators;

public class LeapYear {

    public static void main(String[] args) {
       int year =2020;
       boolean leapYear = (year%4==0);

        System.out.println(year + " is a Leap Year: " + leapYear);

        int year2 = 2023;
        boolean leapYear2 = (year2%4==0);
        System.out.println(year2 + " is a Leap Year: " + leapYear2);

        int year3 = 2025;

        boolean IsTheYear3LeapYear = year3 % 4 ==0;
        System.out.println(year3 + " is a leap year: " + IsTheYear3LeapYear);




    }
}
/*
 2. create a class named LeapYear, and write a program
 that can identify if the given year is leap Year,
 print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year
 */