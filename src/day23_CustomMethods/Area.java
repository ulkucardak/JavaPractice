package day23_CustomMethods;

import javax.lang.model.SourceVersion;

public class Area {
    public static void main(String[] args) {
        areaOfCircle(5);
        areaOfSquare(10);


    }
    //  create a method that can calculate the area of a circle

    public static void areaOfCircle (int r){
        double pi = 3.14;
        double areaOfCircle = pi * r * r;
        System.out.println("Area Of Circle = " + areaOfCircle);
    }

    // create a method that can calculate the area of a square
    public static void areaOfSquare (double side){
        double areaOfSquare = side * side;
        System.out.println("Area Of Square = " + areaOfSquare);
    }


}


/*
6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square
 */
