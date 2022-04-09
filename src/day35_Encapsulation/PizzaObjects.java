package day35_Encapsulation;

public class PizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,3);

        Pizza pizza2 = new Pizza("medium", 3, 7);

        Pizza pizza3= new Pizza("Large", 4, 5);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
