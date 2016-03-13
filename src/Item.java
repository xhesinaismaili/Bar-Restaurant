/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
import java.io.*;

public class Item implements Serializable{
    private int itemId;
    private static int counter;
    private String itemName;
    private double price;
    
    public final static double christmas = 0.2;
    public final static double idiscount = 0.1;
    
    public Item(String itemName, double price) {
        counter++;
        this.itemId = counter;
        this.itemName = itemName;
        this.price = price;
        
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Item.counter = counter;
    }
    
    public int getItemId() {
        return itemId;
    }

    public void setItemId() {
        this.itemId++;
    }


    public void setItemName(String tempItemName) {
        itemName = tempItemName;
    }

    public String getItemName() {
        return itemName;
    }
    
    public void setPrice(double price1) {
        if ( price1 < 0.0 )
        price = 0.0;
        else            
        price = price1;
    }


    public double getPrice() {
        return price;
    }
    
    
    public double calculateDiscount()
    {
        return 0;
    }
    
    public String PrintInfo()
    {
        return String.format("%d: \n%s: \n%.2f:","Id",getItemId(),"Name",getItemName(),"Price",getPrice());
    }
}
