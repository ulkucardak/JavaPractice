package day31_Constructors.RestaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Ulku Cardak", "EN2 7HW", 4);

        Server server1 = new Server("Murat",12,10,false);
        Server server2 = new Server("Betul",13,10,true);
        Server server3 = new Server("Ahmet",14,10,false);
        Server [] servers1 = {server1, server2, server3};

        restaurant1.hireServers(servers1);

        Chef chef1 = new Chef("Mehmet", 14, 8,true);
        Chef chef2 = new Chef("Sait", 15, 8,false);
        Chef [] chefs1 = {chef1, chef2};

        restaurant1.hireChefs(chefs1);

        System.out.println(restaurant1);
    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */