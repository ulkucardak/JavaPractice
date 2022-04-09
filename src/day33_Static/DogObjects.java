package day33_Static;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Ginger","Maltipoo", "small", 'F', 2, "brown");

        dog1.eat();
        dog1.play();
        dog1.sleep();

        System.out.println(dog1.name+ " is a friendly : "+ Dog.isFriendly);
        System.out.println(dog1.name+ " has "+ Dog.numberOfLegs+ " legs");
    }
}
