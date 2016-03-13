/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class ItemChristmas extends Item{
    private double discountChristmas;

    public ItemChristmas(String itemName, double price) {
        super(itemName, price);
        this.discountChristmas = christmas;
    }

    public double getDiscountChristmas() {
        return discountChristmas;
    }

    public void setDiscountChristmas(double discountChristmas) {
        this.discountChristmas = discountChristmas;
    }
    @Override
    public double calculateDiscount()
    {
        return getDiscountChristmas()* super.getPrice() + super.calculateDiscount();
    }
    @Override
    public String PrintInfo()
    {
        return String.format("%s\n %s %.2f",super.PrintInfo(), "Christmas Discount", calculateDiscount());
    }
}
