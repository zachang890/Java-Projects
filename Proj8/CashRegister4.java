/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister4
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister4()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }
   
   /**
      Processes the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
  /**
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
           
   }
   **/
   public void recordPayment(int count, Coin coinType) {
      payment += count*coinType.getValue();
    }
   
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double getChange()
   {
       double change = payment - purchase;
       double newVals = (double)Math.round(change * 100d) / 100d;
       return newVals;
   }
   public double giveChange(Coin coinType)
   {
      int values = 0; 
      
      double dollars = getChange()/1.0;
      int dollarA = (int) dollars;
      
      double quarters = (getChange() - dollarA)/0.25;
      int quartersA = (int) quarters;
      
      double dimes = (getChange() - dollarA - (quartersA*0.25))/0.1;
      int dimesA = (int) dimes;
      
      double nickels = (getChange() - dollarA - (quartersA*0.25) - (dimesA*0.1))/0.05;
      int nickelsA = (int) nickels;
      
      double pennies = (getChange() - dollarA - (quartersA*0.25) - (dimesA*0.1) - (nickelsA*0.05))/0.01;
      int penniesA = (int) pennies;
      if(coinType.getName().equals("Dollar")) {
          values = dollarA;
      }
      else if(coinType.getName().equals("Quarter")) {
          values = quartersA;
      }
      else if(coinType.getName().equals("Dime")) {
          values = dimesA;
      }
      else if(coinType.getName().equals("Nickel")) {
          values = nickelsA;
      }
      else if(coinType.getName().equals("Penny")) {
          values = penniesA + 1;
      }
      
      return values;
   }
}
