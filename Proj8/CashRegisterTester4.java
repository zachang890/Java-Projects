/**
   This class tests the CashRegister class.
*/
public class CashRegisterTester4
{
   public static void main(String[] args)
   {
      CashRegister4 register = new CashRegister4();

      register.recordPurchase(4.98);
      register.recordPurchase(6.26);
      
      Coin dollar = new Coin(1.00, "Dollar");
      register.recordPayment(21, dollar);
      Coin quarter = new Coin(0.25, "Quarter");
      register.recordPayment(2, quarter);
      Coin dime = new Coin(0.10, "Dime");
      register.recordPayment(8, dime);
      Coin nickel = new Coin(0.05, "Nickel");
      register.recordPayment(9, nickel);
      Coin penny = new Coin(0.01, "Penny");
      register.recordPayment(16, penny);
      
      //register.receivePayment(4, 3, 1, 1, 2);
      
      
      System.out.println("Change: " + register.getChange());
      System.out.println("Expected: 11.67");
      System.out.println(register.giveChange(dollar) + " dollars");
      System.out.println(register.giveChange(quarter) + " quarters");
      System.out.println(register.giveChange(dime) + " dimes");
      System.out.println(register.giveChange(nickel) + " nickels");
      System.out.println(register.giveChange(penny) + " pennies");
      
      /**
      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      register.receivePayment(23, 2, 0, 0, 0);
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("Expected: 2.0");
      **/
   }
}
