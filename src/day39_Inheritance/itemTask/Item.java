package day39_Inheritance.itemTask;

public class Item {

    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public Item(String name, int catalogNumber, int quantity, double price) {
        setName(name);
        setCatalogNumber(catalogNumber);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name!");
            return;
        }
        this.name = name;
    }

    public void setCatalogNumber(int catalogNumber) {
        if(catalogNumber<0){
            System.err.println("Invalid number!");
            return;
        }
        this.catalogNumber = catalogNumber;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Invalid number for quantity!");
            return;
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Invalid number for price!");
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Reguler Item{" +
                "name='" + name + '\'' +
                ", catalogNumber=" + catalogNumber +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
/*
/*
    In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes
Please follow the instructions on top of each method.
Work on this flow:
Item > OnSaleItem > TJMaxx
     */

    //private instance variables


    /*
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */



    /**
     * setter for name instance variable
     * @param name
     */




    /**
     * setter for private price
     * @param price
     */



    /**
     * getter for price
     * @return
     */




    /**
     * getter for name
     * @return
     */






    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */



