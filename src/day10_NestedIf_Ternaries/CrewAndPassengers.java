package day10_NestedIf_Ternaries;

public class CrewAndPassengers {
    public static void main(String[] args) {

        /*int total=75,
                crew=0, passenger=0;

        if (total==50 || total==75 ||total==100){
            if(total==50){
                crew=20;
                passenger=30;
            }else if (total==75){
                crew=25;
                passenger=50;
            }else if (total==100){
                crew=30;
                passenger=70;
            }
            String result = "Total is "+ total+ " : "+ crew+ " crew "+ passenger+" passenger";
            System.out.println(result);

        }else {
            System.out.println("Invalid number for people on the ship!");
        }

         */
        int number = 150;
        String result = "";
        boolean validNumber = number==50 || number==75 || number==100;

        if(validNumber){
            if(number==50){
                result = "20 Crew, 30 Passenger";
            }else if(number==75){
                result= "25 Crew, 50 Passenger";
            }else{
                result= "30 Crew, 70 Passenger";
            }

        }else{
            result="Invalid number for people on the ship!";
        }

        System.out.println(result);
    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */