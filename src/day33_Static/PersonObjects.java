package day33_Static;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Ulku", 40, 'F');
        Person person2 = new Person("Ahmet", 2, 'M');
        Person person3 = new Person("Betul", 12, 'F');
        Person person4 = new Person("Murat", 19, 'M');

        System.out.println(person1);
        person1.eat("bread");
        person1.drink("tea");
        person1.sleep();

        System.out.println(person1.name + " has " + Person.numberOfHead+ " head");
        System.out.println(person1.name + " has " + Person.numberOfEyes+ " eyes");
        System.out.println(person1.name+ " is a human : " +  Person.isHuman);
        System.out.println(person1.name+ " has a nose : " +  Person.hasNose);
        System.out.println(person1.name+ " has wings : " +  Person.hasWings);


    }
}
