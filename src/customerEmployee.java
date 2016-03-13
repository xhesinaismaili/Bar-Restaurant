/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class customerEmployee extends Customer{
    private double amount;

    public customerEmployee(double payment, int type, int userId, String username, String password, String address, int phonenumber) {
        super(type, userId, username, password, address, phonenumber);
        this.amount = payment;
    }

    public double getPayment() {
        return amount;
    }

    public void setPayment(double payment) {
        this.amount = payment;
    }
    @Override
    public double calculateBonus() {
          if( amount > 500 )
            return 50;
          else
            return 0;
    }

    @Override
    public String printInfo(){
         return super.toString() + " | Bonus " + calculateBonus();
    }
}
