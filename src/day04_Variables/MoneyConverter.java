package day04_Variables;

public class MoneyConverter {

    public static void main(String[] args) {

        int dollar = 1000;
        double euro = dollar * 0.88;
        double lira = dollar * 13.45;
        double pound = dollar * 0.73;
        System.out.println("$1000 = " + "€"+euro);
        System.out.println("$1000  = " + "₺"+lira);
        System.out.println("$1000 = " + "£"+pound);

    }
}
