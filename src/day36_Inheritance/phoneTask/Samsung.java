package day36_Inheritance.phoneTask;

public class Samsung extends Phone {

    public Samsung( String model, String size, String color) {
        super("Samsung", model, size, color);
    }

    public void freeze(){
        System.out.println(brand + " "+ model + " is freezing");
    }
}
