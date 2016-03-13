/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
public class tableFidelity extends Table{
    
    private int points;

    public tableFidelity(Waiter user) {
        super(user);
        
    }

    
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    @Override
    
    public void printInfo(){
        System.out.println(this.toString() + " ; Bonus: " + calculateBonus());
    }

    @Override
    //this will be overriten by all product classes
    public double calculateBonus(){
        points = (int)(getTotalAmount() / 10);
        return (points / 100)*50;
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
