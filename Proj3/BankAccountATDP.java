/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals.
 * @author C. Horstmann, modified by A. Nguyen
 * @version v. 1.0
*/
public class BankAccountATDP
{  
   private double balance;  // request RAM space

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccountATDP()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccountATDP(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}
