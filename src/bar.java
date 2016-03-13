/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
import java.util.*;


public class bar 
{
    private static ArrayList<Manager> managerlist = new ArrayList<Manager>();
    private static ArrayList<Waiter> waiterlist = new ArrayList<Waiter>();
    private static ArrayList<Table> tablelist = new ArrayList<Table>();
    private static ArrayList<Item> itemlist = new ArrayList<Item>();
    private static Waiter waiter;
    public static Scanner input = new Scanner( System.in );
    
   
    public static void main(String[] args)
    {
        
        Manager Manager = new Manager(1112,"Manager","man","man1",4335344);
        Waiter waiter1 = new Waiter(1234,"Manager","man","man1",454645445);
        Waiter waiter2 = new Waiter(1111,"Xhesina","Ismaili","xhesi",5464535);
        managerlist.add(Manager);
        waiterlist.add(waiter1);
        waiterlist.add(waiter2);
        Item it = new Item("energy drink",2.5);
        Item it1 = new Item("soda",2);
        itemlist.add(it);
        itemlist.add(it1);
        System.out.printf("%d , %s, %.2f\n",it.getItemId(),it.getItemName(),it.getPrice());
        System.out.printf("%d , %s, %.2f",it1.getItemId(),it1.getItemName(),it1.getPrice());
        
        Table x = new tableFidelity(waiter1);
        x.printInfo();
    }
}
    /*
    public static int waiterlogin(String uname,String pass)
    {
        for(int i = 0; i < waiterlist.size(); i++)
            if(uname.equals(waiterlist.get(i).getUsername()) && pass.equals(waiterlist.get(i).getPassword()))
                return i;   
        return 0;
    }
    
    public static int managerlogin(String uname,String pass)
    {
        for(int i = 0; i < managerlist.size(); i++)
            if(uname.equals(managerlist.get(i).getUsername()) && pass.equals(managerlist.get(i).getPassword()))
                return i;   
        return 0;
    }
    
    public static void userLogin()
    {
        
         int choice;

          do{
              System.out.println("|----------------------------------------------|");
              System.out.println("|   Welcome to the Bar program                 |");
              System.out.println("|----------------------------------------------|");
              System.out.println("|  1. Log in as Manager                        |");
              System.out.println("|  2. Log in as a Waiter                       |");
              System.out.println("|  3. Exit                                     |");
              System.out.println("|----------------------------------------------|");
              choice=input.nextInt();


              switch(choice)
              {
                  case 1:
                      System.out.printf("Enter Manager's username: ");
                      String username = input.next();
                      System.out.printf("Enter Manager's pasword: ");
                      String pass = input.next();
                      for(int i = 0; i < managerlist.size(); i++)
                      {
                      if(username.equals(managerlist.get(i).getUsername()) && pass.equals(managerlist.get(i).getPassword()))
                          System.out.println("hello manager");
                          //managerMenu();
                      
                      else
                          System.out.println("The password or the username was incorrect"); 
                      }
                      break;
                  case 2:
                      int check = 0;
                      
                      System.out.printf("Enter waiter's username: ");
                      String wusername = input.next();
                      System.out.printf("Enter waiter's password: ");
                      String wpassword = input.next();
                      for(int i=0; i < waiterlist.size();i++)
                      {
                          if(wusername.equals(waiterlist.get(i).getUsername()) && wpassword.equals(waiterlist.get(i).getPassword()))
                          
                          waiterMenu();
                          
                      else
                          System.out.println("The password or the username was incorrect"); 
                      }
                  case 3:
                      System.exit(0);
              }
          }while(choice != 0 || choice != 1 || choice != 2);
          
}
    
 public static void managerMenu()
 {
     int i;
 }
 
 public static void waiterMenu()
 {
     
     System.out.println("Welcome to waiter Menu ");
              System.out.println("----------------------------------------------------------|");
              System.out.println("1.New table                                               |");             
              System.out.println("2.Print information for a table with a certaid ID         |");
              System.out.println("3.Switch user");
              System.out.println("0.Exit");
              System.out.println("-----------------------------------------------------------");
              int choice=input.nextInt();
              
              switch(choice)
              {
                  case 1:
                  {
                      Table table1 = new Table(waiter.getUserId());
                      table1.setTableId(tablelist.size());
                      System.out.println("1.Insert item in table                                    |");
                      System.out.println("2.Remove item from table                                  |");
                      System.out.println("3.Apply discount of 20% for the table");
                      System.out.println("4.Modify item in table");
                      System.out.println("3.Exit");
                      int c;
                      c = input.nextInt();
                      switch(c)
                      {
                          
                      }
                  }
                     
              }
 }
    
    
    
}
*/
