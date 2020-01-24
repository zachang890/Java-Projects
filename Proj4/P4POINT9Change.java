
/**
 * This program directs a cashier how to give change.
 * 
 * @author Zachary Chang
 * @version June 29, 2016
 */
import java.util.Scanner;

public class P4POINT9Change
{
   public static void main(String[] args)
   {
       
       Scanner kboard = new Scanner(System.in);
       System.out.println("How much money is owed? Please state amount in pennies not dollars.");
       double owe = kboard.nextInt();
       System.out.println("How much money will you give?. Please state amount in pennies.");
       double given = kboard.nextInt();
       
       double change = given - owe;
       int dollars = (int)change/100;
       
       int rest1 = (int)change - dollars*100;
       int quarters = (int)rest1/25;
       
       int rest2 = (int)rest1 - quarters*25;
       int dimes = (int)rest2/10;
       
       int rest3 = (int)rest2 - dimes*10;
       int nickels = (int)rest3/5;
       
       int rest4 = (int)rest3 - nickels*5;
       int pennies = (int)rest4/1;
       
       System.out.println("Give the customer " + dollars + " dollars.");
       System.out.println("Give the customer " + quarters + " quarters.");
       System.out.println("Give the customer " + dimes + " dimes.");
       System.out.println("Give the customer " + nickels + " nickels.");
       System.out.println("Give the customer " + pennies + " pennies.");
       
   }
}
