/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class loyalCustomer extends Customer{

    private int points;

    public loyalCustomer(int points, int type, int userId, String username, String password, String address, int phonenumber) {
        super(type, userId, username, password, address, phonenumber);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    @Override
    public double calculateBonus()
    {
        return points/100 * 50;
    }
    
    @Override
    public String printInfo()
    {
        return super.printInfo() + " Bonus " + calculateBonus();
    }
}
