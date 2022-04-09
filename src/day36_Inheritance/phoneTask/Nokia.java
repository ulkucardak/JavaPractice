package day36_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, String color) {
        super("Nokia", model, size, color);
    }

    public void selfDefense(){
        System.out.println("You can use " +brand + " "+ model + " as self defence tool");
    }
}
