
/**
 * BankAccount represents a checking account.
 * 
 * @author Zachary Chang 
 * @version June 27, 2016
 */
public class BankAccount
{
    // instance variables
    private double balance;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        balance = 0;
    }
    
    public BankAccount(double initBal)
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
        this.withdraw(30);
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
    
    public static void main (String[] args)
    {
        BankAccount b = new BankAccount(40.0);
        System.out.println(b.getBalance());
    }
}
