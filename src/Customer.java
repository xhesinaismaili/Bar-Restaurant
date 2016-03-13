/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class Customer extends User{
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Customer(int type, int userId, String username, String password, String address, int phonenumber) {
        super(userId, username, password, address, phonenumber);
        this.type = type;
    }
    @Override
    public double calculateBonus()
    {
        return 0;
    }
    @Override
    public String printInfo()
    {
        return super.printInfo() + "Customer type" + getType();
    }
    @Override
    public double getPayment()
    {
        return 0;
    }
}
