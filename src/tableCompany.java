/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class tableCompany extends Table{
    private int numberOfTimesServed;

    public tableCompany(Waiter user) {
        super(user);
    }

    

    public int getNumberOfTimesServed() {
        return numberOfTimesServed;
    }

    public void setNumberOfTimesServed(int numberOfTimesServed) {
        this.numberOfTimesServed = numberOfTimesServed;
    }
    @Override
    public void printInfo(){
        System.out.println(this.toString() + " ; Bonus: " + calculateBonus());
    }
    
    @Override
    public double calculateBonus(){
        if( getItemList().size() >= 300 )
            return getItemList().size() / 300 * 100 ;
        
        return 0;
    }
    @Override
    public double getPayment()
    {
        return super.getTotalAmount();
    }
    @Override
    public String toString()
    {
        return super.toString() + "  Bonus: " + calculateBonus();
    }
}
