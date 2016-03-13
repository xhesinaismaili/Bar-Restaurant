/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
import java.util.*;
import java.io.*;
import java.text.*;


public abstract class Table implements Payable, Serializable{
    private int tableId;
    private static int counter;
    private String userId;
    ArrayList< Item > itemList = new ArrayList();
    private double netAmount;
    private double totalAmount ;
    private static final int vat = 20;
    private static final String address = "Rr. Medar Shtylla";
    private double discount;
    private Waiter user;
    private String time;

    public Table(Waiter user) {
        counter++;
        this.tableId = counter;
        this.user = user;
        time = new Date().toString();
    }

    public String getTime() {
        return time;
    }
   
    
    public void addItemInTable(Item it)
    {
        itemList.add(it);
        
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
        this.netAmount = this.netAmount - (this.netAmount * discount)/100;
       
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getNetAmount() {
        double net = 0;
        for (Item it: itemList) {
           net += it.getPrice();
        }
        return net-net*getDiscount();
    }

    public void setTableId(int id) {
        tableId = id + 1;
    }

    public double getTotalAmount() {
        return getNetAmount() + ((getNetAmount() * vat)/100 ) ;
    }


    public static String getAddress() {
        return address;
    }
    


    public int getTableId() {
        return tableId;
    }

    public static int getVat() {
        return vat;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public Waiter getUser() {
        return user;
    }
    
    @Override
     public String toString()
    {
        return String.format("Table Id: %d Net Amount: %.2f Discount: %.2f VAT: %d; Total amount: %.2f; Items: %d ",
                getTableId(), getNetAmount(), getDiscount(), getVat(), getTotalAmount(), getItemList().size());
    }
     
    public void printInfo()
    {
        System.out.println(this.toString());
        
    }
    
   
    
    public double calculateBonus()
    {
        return 0;
    }
    public void removeItem(int i)
    {
        this.itemList.remove(i);

    }
}
