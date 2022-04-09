package day36_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone( String model, String size, String color) {
        super("Apple", model, size, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " "+ model + " is calling facetime to "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " "+ model + " is calling facetime to "+ email);
    }
}
