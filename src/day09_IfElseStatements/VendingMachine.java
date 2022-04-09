package day09_IfElseStatements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {


                //ENTER CODE HERE
                Scanner scan = new Scanner(System.in);
                int cents,quarters,dimes,nickels,pennies;
                System.out.println("Enter cents");
                cents = scan.nextInt();
                //100 cents= 1 dollar
                //25 cents= 1 quarter
                //10 cents= 1 dimes
                // 1 cent= 1 penny
                quarters=cents/25;
                dimes=(cents%25)/10;
                nickels=((cents%25)%10)/5;
                pennies=((cents%25)%10)%5;
                boolean cent = (cents>0 && cents<100);
                if(cent){
                    System.out.println("Your change is "+ quarters+ " quarters, "+ dimes + " dimes, "+ nickels+ " nickels, and "+ pennies+ " pennies");
                }else {
                    System.out.println("Invalid cents amount");
                }
    }
}
