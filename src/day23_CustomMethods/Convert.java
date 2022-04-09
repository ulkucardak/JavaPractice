package day23_CustomMethods;

public class Convert {
    public static void main(String[] args) {
        convertDollarToEuro(20);
        convertDollarToLira(20);
        convertKgToPounds(20);


    }

    public static void convertDollarToEuro(double dollar){

        double euro = dollar * 0.92;
        System.out.println ("$"+ dollar + " == "+ euro+ " euros" );

    }

    public static void convertDollarToLira(double dollar){
        double lira = dollar * 14.57;
        System.out.println ("$"+ dollar + " == "+ lira+ " lira" );

    }

    public static void convertKgToPounds(double kg){
        double pounds = kg * 2.205;
        System.out.println(kg+ " kg == "+ pounds+ " pounds");
    }

}


/*
    9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb
 */