package day39_Inheritance.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private static boolean hasBattery= true;
    private static boolean hasPowerButton= true;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }



    public void setBrand(String brand) {

        if(brand==null || brand.isBlank()|| brand.isEmpty()){
            System.err.println("Invalid brand name!");
            System.exit(1);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if(model==null || model.isEmpty()|| model.isBlank()){
            System.err.println("Invalid brand name!");
            System.exit(1);
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid number for price!");
            System.exit(1);
        }
        this.price = price;
    }


    public void turnOn(){
        System.out.println("Your device is turn on now");

    }

    public void turnOff(){
        System.out.println("Your device is turn off now");

    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	5. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes


 */