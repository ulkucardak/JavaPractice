package day39_Inheritance.itemTask;

public class OnSaleItem extends Item{

    public OnSaleItem(String name, int catalogNumber, int quantity, double price) {
        super(name, catalogNumber, quantity, price);
    }

    @Override
    public String toString() {
        return  "On Sale Item{" +
                "name='" + getName() + '\'' +
                ", catalogNumber=" + getCatalogNumber() +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice()+
                '}';
    }
}
