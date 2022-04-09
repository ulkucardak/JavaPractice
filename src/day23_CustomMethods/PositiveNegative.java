package day23_CustomMethods;

public class PositiveNegative {
    public static void main(String[] args) {

        whatTypeOfNumber(40);

    }

    public static void whatTypeOfNumber (int number){

        if(number==0){
            System.out.println("Number " +number + " is zero");
        }else if ( number>=0){
            System.out.println("Number " +number + " is a positive number");
        }else {
            System.out.println("Number " +number + " is a negative number");
        }
    }
}
/*
12. create a method that can if the given integer is positive, negative or zero
 */