package day36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", "White");

        Nokia nokia = new Nokia("Brick", "4 inches", "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");




    }
}
