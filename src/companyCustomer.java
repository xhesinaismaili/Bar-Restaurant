/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class companyCustomer extends Customer{
    private int numberOfItemsServed;

    public companyCustomer(int numberOfItemsServed, int type, int userId, String username, String password, String address, int phonenumber) {
        super(type, userId, username, password, address, phonenumber);
        this.numberOfItemsServed = numberOfItemsServed;
    }

    public int getNumberOfItemsServed() {
        return numberOfItemsServed;
    }

    public void setNumberOfItemsServed(int numberOfItemsServed) {
        this.numberOfItemsServed = numberOfItemsServed;
    }
    @Override
    public String printInfo()
    {
        return super.printInfo() + " Bonus " + calculateBonus();
    }
    @Override
    public double calculateBonus()
    {
        return numberOfItemsServed/300 * 100;
    }
}
