package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answer = scan.next();
        String result = "";
        String answer2 = "";

        if(answer.equalsIgnoreCase("no")){
            System.out.println("have a nice day");
        }
        while(!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer! Please re-enter your answer: ");
            answer= scan.next();
        }

        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room would you like to reserve?");
            scan.nextLine();
            answer2 = scan.nextLine();


            while (!(answer2.equalsIgnoreCase("King Bed") || answer2.equalsIgnoreCase("Queen Bed") || answer2.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid room type! Please select again!");
                answer2 = scan.nextLine();
            }

            switch (answer2) {
                case "king bed":
                    result = "King Bed ==> 120$";
                    break;
                case "queen bed":
                    result = "Queen Bed ==> 100$";
                    break;
                case "single bed":
                    result = "single bed ==> 80$";
                    break;
                default:
                    break;
            }
        }
                        System.out.println(result);

            }



        }





/*

  5. Create a class called RommReservation, write a program for the room reservation,
  your program asks the user wants to reserve a room.
   if user entered yes, then ask which type of room the user wants to reserve.
   if user entered no, print "have a nice day"
   (if user entered any invalid answer (other than yes/no)
   ask user to reenter until user provides a valid entry)

	          King Bed ==> 120$
	           Queen Bed ==> 100$
	           single Bed ==> 80$

the program should be able to display the room he/she reserved and total price of the room.

 (if the user selected an invalid room, ask the user to reselect the room
 until user provides a valid entry)
 */