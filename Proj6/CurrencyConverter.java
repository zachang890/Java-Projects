
/**
 * Converts dollars to euros.
 * 
 * @author Zachary Chang 
 * @version July 9, 2016
 */
import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("How many euros are in one dollar?");
        double conversion = kboard.nextDouble();
        
        System.out.println("Type in a dollar value or press Q to quit.");
        while(kboard.hasNextDouble()) {
            if(kboard.hasNextDouble()) {
            double input = kboard.nextDouble();
            double converted = input * conversion;
            System.out.println(input + " dollar = " + converted + " euro");
            System.out.println("Type in a dollar value or press Q to quit.");
          }
        }
    }
}
