package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String product = scan.nextLine();
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        System.out.println("Enter quantity of product: ");
        int quantity = scan.nextInt();
        System.out.println("Enter your first name: ");
        String firstName= scan.next();
        double totalPrice = price*quantity;

        System.out.println(firstName+ ", your order for "+ quantity + " kg "+ product+ " has been places. Your total is : £"+ totalPrice);
        scan.close();
    }
}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */