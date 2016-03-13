/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class Waiter extends User{
    private int internalPhoneNumber;
    private double wagePerHour;
    private int hoursOfWork;

    public Waiter(int userId, String username, String password, String address, int phonenumber) {
        super(userId, username, password, address, phonenumber);
        
    }

    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber(int internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }
    @Override
    public String printInfo()
    {
        return super.printInfo() + "Internal phone number:" + getInternalPhoneNumber() +
                "\n Bonus "+calculateBonus();
    }
    @Override
    public double calculateBonus()
    {
        if(getHoursOfWork()>40)
            return (getHoursOfWork()-40)*5;
        else
            return 0;
    }
    
    @Override
    public double getPayment()
    {
        if(getHoursOfWork()>40)
            return getHoursOfWork() * getWagePerHour() + (getHoursOfWork()-40)*5;
        else
            return getHoursOfWork() * getWagePerHour();
    }   
}
