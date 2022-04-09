package day23_CustomMethods;

public class Calculation {
    public static void main(String[] args) {
        calculator(24,3,'&');


    }
    public static void calculator(int num1, int num2, char mathOperator){
        int result = 0;
        if(mathOperator=='+'){
            result = num1 + num2;
        }else if(mathOperator=='-'){
            result = num1 - num2;
        }else if(mathOperator== '*'){
            result = num1 * num2;
        }else if (mathOperator== '/'){
            result = num1 / num2;
        }else{
            System.out.println("Invalid Math Operator!");
        }
        System.out.println("result = " + result);
    }
}
/*
15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
prints the calculation result
 */