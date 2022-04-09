package day21_ForEachLoop;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 2, 9, 1, 0, 7, 11, 23, 8};
        int countEven = 0;
        int countOdd = 0;

        for (int number : numbers) {

            if(number%2 == 0){
                countEven += 1;
            }
            if(number%2 != 0){
                countOdd += 1;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */