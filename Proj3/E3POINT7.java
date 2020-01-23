
/**
 * Interest in a bank account
 * 
 * @author Zachary Chang and Jaiveer Singh
 * @version June 27, 2016
 */
public class E3POINT7
{
   // instance variables
    private double balance;
    private double interestRate;

    /**
     * Constructor for objects of class BankAccount
     */
    public E3POINT7()
    {
        // initialise instance variables
        balance = 0;
    }
    
    
    
    public E3POINT7(double initBal)
    {
        // initialise instance variables
        balance = initBal;
    }
    
    /**
     * Returns the current balance
     * 
     * @return     the current balance 
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Takes out money
     * 
     * @param amount to be withdrawn
     */
    public void withdraw(double amount) 
    {
        balance = balance - amount;
    }    
    
    /**
     * Puts in money
     * 
     * @param amount to be deposited
     */
    public void deposit(double amount) 
    {
        balance = balance + amount;
    }
    
    public void addInterest(double rate)
    {
        interestRate = 10;
        balance = balance * interestRate/100 + balance;
    }    
}
