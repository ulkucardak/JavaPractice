package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floor number:");
        int floorNumber = scan.nextInt();
        String result = " ";

        if (floorNumber == 1) {
            result = "Floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks";

        } else if (floorNumber == 2) {
            result = "Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat";
        } else if (floorNumber == 3) {
            result = "Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake house";
        } else {
            result = "Invalid floor";
        }
        System.out.println(result);

        System.out.println("---------------------------------");

        switch (floorNumber) {
            case 1:
                result = "Floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result = "Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result = "Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result = "Invalid floor";
        }
        System.out.println(result);

        System.out.println("---------------------------------");

        if (floorNumber >= 1 && floorNumber <= 3) {
            switch (floorNumber) {
                case 1:
                    result = "Floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    result = "Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake house";
                    break;
                default:
                    break;
            }
        } else {
            result = "Invalid floor";
        }
        System.out.println(result);

    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */