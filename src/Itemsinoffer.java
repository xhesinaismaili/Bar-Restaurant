/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class Itemsinoffer extends Item{
    private int buyMore;
    private double payLess;
    private int itemoffer;

    public Itemsinoffer(String itemName, double price) {
        super(itemName, price);
        this.buyMore = buyMore;
        this.payLess = payLess;
        this.itemoffer = itemoffer;
    }

    public int getItemoffer() {
        return itemoffer;
    }

    public void setItemoffer(int itemoffer) {
        this.itemoffer = itemoffer;
    }
    
    

    public int getBuyMore() {
        return buyMore;
    }

    public void setBuyMore(int buyMore) {
        this.buyMore = buyMore;
    }

    public double getPayLess() {
        return payLess;
    }

    public void setPayLess(double payLess) {
        this.payLess = payLess;
    }
    @Override
    public double calculateDiscount()
    {
        if(buyMore<itemoffer)
            return getPayLess() * super.getPrice();
        else
            return 0;
    }
    @Override
    public String PrintInfo()
    {
        return String.format("%s\n %s %.2f",super.PrintInfo(), "Buy more, pay less ", calculateDiscount());
    }
}
