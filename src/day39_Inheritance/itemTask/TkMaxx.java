package day39_Inheritance.itemTask;

import java.util.ArrayList;
import java.util.Arrays;

public class TkMaxx {

    public Item regularItems;
    public OnSaleItem salesItem;

    public TkMaxx(Item regularItems, OnSaleItem salesItem) {
        this.regularItems = regularItems;
        this.salesItem = salesItem;
    }

    @Override
    public String toString() {
        return "TkMaxx{" +
                 regularItems + "\n"+
                 salesItem + "\n" +
                '}';
    }

    public static void main(String[] args) {

        Item item3 = new Item("jeans", 10990, 1, 59.99 );

        Item item4 = new Item("coat", 10009000, 1, 120.99);

        //Item [] items1 = {item3,item4};

        OnSaleItem item1 = new OnSaleItem("shoes", 123,1, 19.99);

        OnSaleItem item2 = new OnSaleItem("shirt",567,2, 14.99);

        //OnSaleItem [] onSalesItems = {item1,item2};

        TkMaxx shoppingBag1 = new TkMaxx(item3,item1);

        TkMaxx shoppingBag2 = new TkMaxx(item4,item2);

        ArrayList<TkMaxx> salesReport = new ArrayList<>();

            salesReport.add(shoppingBag1);
            salesReport.add(shoppingBag2);

        System.out.println(salesReport);







    }
}
