package day35_Encapsulation;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Ulku Cardak", 12345678901L, 20000);

        System.out.println(bankAccount1);

        bankAccount1.deposit(5000);

        System.out.println(bankAccount1.getBalance());

        bankAccount1.withDraw(3000);

        System.out.println(bankAccount1.getBalance());

        bankAccount1.checkBalance();
    }
}
