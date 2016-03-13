/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class tableEmployee extends Table{

    public tableEmployee(Waiter user) {
        super(user);
    }
    
    
    @Override
    
    public void printInfo(){
        System.out.println(this.toString() + " ; Bonus: " + calculateBonus());
    }

    @Override
    public double calculateBonus(){
       if( super.getTotalAmount() > 500 )
           return 50 ;
       else
           return 0;
    }
    @Override
    public double getPayment()
    {
        return getTotalAmount();
    }
    @Override
    public String toString()
    {
        return super.toString() + " ; Bonus: " + calculateBonus();
    }
}
