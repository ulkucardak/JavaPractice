package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Ulker", 2, 2.5, false);

        Candy candy2 = new Candy("Eti", 3, 1.5, true);

        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList(candy1,candy2));
        /*candies.add(candy1);
        candies.add(candy2);*/

        for (Candy each : candies) {
            System.out.println(each.getBrand() + " " + each.getPrice());

        }
    }
}
