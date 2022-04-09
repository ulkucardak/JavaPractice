package day35_Encapsulation;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private int balance;

    public BankAccount(String accountHolder, long accountNumber, int balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
       setBalance(balance);
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setAccountHolder(String accountHolder){

        for (int i = 0; i < accountHolder.length() ; i++) {
            if( !(Character.isLetter(accountHolder.charAt(i))) && !(accountHolder.contains(" ")) ){
                return;
            }
        }
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber){
        if(accountNumber<0){
            return;
        }
        this.accountNumber= accountNumber;
    }

    public void setBalance(int balance){
        if(balance<0){
            return;
        }
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Amount cannot be zero or negative!");
            return;
        }
        balance += amount;
    }

    public void withDraw(int amount){
        if(amount>balance){
            System.out.println("There is no enough money!");
            return;
        }
        if(amount<=0){
            System.out.println("Amount cannot be zero or negative!");
            return;
        }
        balance -= amount;
    }

    public void checkBalance(){
        System.out.println("Your current balance is = $"+ getBalance());
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */