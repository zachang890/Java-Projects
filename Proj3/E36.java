
/**
 * This program represents a checking account
 * 
 * @author Jaiveer Singh and Zachary Chang
 * @version 27 June, 2016
 */
public class E36
{
    
    private double balance;

    /**
     * Constructor for objects of class E36
     */
    public E36()
    {
       balance = 0;
    }

    
    public E36(double initBal)
    {
        balance = initBal;
    }

    public double getBalance()
    {
        return balance;
    }
    
    
    /**
     * This method withdraws money from balance
     * @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {
        balance = balance - amount;
       
    }
    /**
     * This method deposits money into the balance
     * @param amount the amount to deposit
    */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
}
