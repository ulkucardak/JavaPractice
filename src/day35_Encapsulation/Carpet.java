package day35_Encapsulation;

public class Carpet {
    private int width, length;
    private double unitPrice;
    private boolean isPersian;

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);

    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        if(width<0){
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost(){
        double cost = (isPersian)? (width*length)*unitPrice + 200 : (width*length)*unitPrice;
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total cost is = " + calcCost() +
                '}';
    }
}
/*
3. Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice

 */