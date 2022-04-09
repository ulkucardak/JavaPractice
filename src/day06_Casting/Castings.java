package day06_Casting;

public class Castings {

    public static void main(String[] args) {

        float avarageScore = 20.5f;

        byte num1 = (byte)avarageScore;
        short num2 = (short) avarageScore;
        int num3 = (int)avarageScore;
        long num4 = (long)avarageScore;
        float num5= avarageScore;
        double num6= avarageScore;

    }
}
/*
   Warmup tasks:
	1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */