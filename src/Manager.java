/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class Manager extends User{
    
      private int internalPhoneNumber;

    public Manager(int userId, String username, String password, String address, int phonenumber) {
        super(userId, username, password, address, phonenumber);
    }

    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber(int internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }
      
    @Override
    public String printInfo()
    {
        return super.printInfo() + "Internal Phone Number " + getInternalPhoneNumber();
    }
    @Override
    public double getPayment()
    {
        return 1000.0;
    }
}
