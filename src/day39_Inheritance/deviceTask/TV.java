package day39_Inheritance.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void channelUp(){
        System.out.println("Next channel is loading..");
    }

    public void channelDown(){
        System.out.println("go back previous channel");

    }

}
/*
4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */