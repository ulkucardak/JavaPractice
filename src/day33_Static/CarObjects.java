package day33_Static;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Jaz", "Grey", 2005, 5000);

        System.out.println(car1.make+ " " +car1.model+" has battery : "+ Car.hasBattery);
    }
}
