package day36_Inheritance.restaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Ulku Cardak", "Enfield", 5);

        Server server1 = new Server("Murat",19,'M',"server",123,20000,"Nandoz",10,false);
        Server server2 = new Server("Betul",20, 'M',"server",567,250000,"Nandoz",10,true);
        Server [] server = {server1, server2};

        Chef chef1 = new Chef("Mehmet",45,'M',"Chef",890,300000,"Nandoz",15,true);
        Chef chef2 = new Chef("Ahmet",25,'M',"Chef",12334,250000,"Nandoz",12, false);
        Chef [] chef = {chef1, chef2};

       // restaurant.chefs.addAll(Arrays.asList(chef));
        //restaurant.servers.addAll(Arrays.asList(server));

        restaurant.hireChef(chef);
        restaurant.hireServer(server);



        System.out.println(restaurant);

        for (Chef eachChef : restaurant.chefs) {
            System.out.println(eachChef.name+ " "+ eachChef.salary);

        }
        for (Server eachServer : restaurant.servers) {
            System.out.println(eachServer.name+ " "+ eachServer.salary);

        }


    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */