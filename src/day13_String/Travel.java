package day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport?");
        String passport = scan.next();
        scan.nextLine();
        int baseCost= 1000;

        if (passport.equals("Yes")){
            System.out.println("Which country are you going to travel?");
            String countryName = scan.nextLine();
            System.out.println("How many bags will you take with you?");
            int numberOfBags = scan.nextInt();
            System.out.println("How many people will they travel with you?");
            short peopleYouTravelWith = scan.nextShort();
            System.out.println("What are their name who are travelling with you? :");
            scan.nextLine();
            String nameOfPeople= scan.nextLine();

            double personCost = 0.0;

            if (peopleYouTravelWith>=1 && peopleYouTravelWith<=3){
                 personCost = peopleYouTravelWith*100;
            }else{
                 personCost = 300;
            }


            double costAmount = baseCost+ numberOfBags*50 - personCost;

            System.out.println("Your ticket is booked to "+ countryName+ ". We have charged extra for the "+
                    numberOfBags +" bags but you are traveling with "+nameOfPeople+ " so we are giving a discount. Your total cost is "+"$"+costAmount);

        }else if(passport.equals("No")){
            int costRenewal = 200;
            System.out.println("When your passport is expired?:");
            int expiredTime = scan.nextInt();
            System.out.println("Which countries do you want to go?: ");
            scan.nextLine();
            String countryNames = scan.nextLine();
            System.out.println("Are you going to travel next year?:");
            String answer2= scan.next();

            double costAmount2 = costRenewal + expiredTime*75;

            if (answer2.equals("Yes")){
                 costAmount2 += 100.0;
            }else{
                costAmount2 -= 50.0;
            }

            System.out.println("Looks like your password has been expired for "+expiredTime+ " years,"+
                    "\nbut not to worry we will get it ready for you to travel to "+countryNames+ ". Your total cost has come out to "+"$"+costAmount2+".");
        }

    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith so we are giving a discount.
            		Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."
 */