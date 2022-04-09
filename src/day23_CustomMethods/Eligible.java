package day23_CustomMethods;

public class Eligible {
    public static void main(String[] args) {

        isPersonEligibleBuyAlcohol(25);
        isPersonEligibleForVote(20,"USA");


    }

    // create a method that can check if a person is eligible to buy alcohol

    public static void isPersonEligibleBuyAlcohol(int age){
        if (age>=18){
            System.out.println("You are eligible to buy Alcohol");
        }else{
            System.out.println("You are not eligible to buy Alcohol");
        }

    }

    // create a method that can check if a person is eligible to vote

    public static void isPersonEligibleForVote (int age, String citizen){

        if(age>=18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote!");
        }else {
            System.out.println("You are not eligible to vote!");
        }
    }


}


/*
3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */