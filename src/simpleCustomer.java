/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class simpleCustomer extends Customer{

    public simpleCustomer(int type, int userId, String username, String password, String address, int phonenumber) {
        super(type, userId, username, password, address, phonenumber);
    }
    
    
@Override
    public double calculateBonus() 
    {
            return 0;
    }

    @Override
    public String printInfo(){
         return super.toString() + " Bonus " + calculateBonus();
    }
}
