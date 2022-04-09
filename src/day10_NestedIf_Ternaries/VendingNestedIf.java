package day10_NestedIf_Ternaries;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String selection= scan.next();
        String drink= scan.next();
        String snack=scan.next();

        if(selection.equals(drink)){

        }

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */