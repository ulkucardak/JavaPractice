package day24_CustomMethods_ReturnMethod;

public class MaxAndMinNumberFromArray {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        
       int maxNumber = maxNumber(numbers);
        System.out.println("maxNumber = " + maxNumber);
        
        int minNumber = minNumber(numbers);
        System.out.println("minNumber = " + minNumber);
        
    }

    // 2. create a method that can return the maximum number from an array of integers
    
    public static int maxNumber (int[] numbers){
        
        int maxNumber = 0;
        for (int number : numbers) {
            
            if(number>maxNumber){
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    // 3. create a method that can return the minimum number from an array of

    public static int minNumber (int [] numbers){
        int minNumber = numbers[0];

        for (int number : numbers) {
            
            if(number < minNumber){
                minNumber = number;
            }
        }
        return minNumber;
    }



}
