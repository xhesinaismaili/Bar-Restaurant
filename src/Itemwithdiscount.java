/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class Itemwithdiscount extends Item{

    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Itemwithdiscount(String itemName, double price) {
        super( itemName, price);
        this.discount = idiscount;
    }
    @Override
    public double calculateDiscount()
    {
        return super.calculateDiscount() + discount * super.getPrice();
    }
    @Override
    public String PrintInfo()
    {
        return String.format("%s\n %s %.2f",super.PrintInfo(),"discount",calculateDiscount());
    } 
}
