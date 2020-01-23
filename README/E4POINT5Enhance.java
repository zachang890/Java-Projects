
/**
 * Aligns the output from E4.4
 * 
 * @author Zachary Chang
 * @version June 29, 2016
 */
import java.util.Scanner;

public class E4POINT5Enhance
{
   public static void main(String[] args)
   {
       Scanner kboard = new Scanner(System.in);
       
       System.out.println("Give me an integer.");
       double number1 = kboard.nextInt();
       
       System.out.println("Give me another integer.");
       double number2 = kboard.nextInt();
       
       double sum = number1 + number2;
       System.out.println("Sum:                " + sum);
       
       double difference = number1 - number2;
       System.out.println("Difference:         " + difference);
       
       double product = number1*number2;
       System.out.println("Product:            " + product);
       
       double average = (number1 + number2)/2;
       System.out.println("Average:            " + average);
       
       double distance = Math.abs(difference);
       System.out.println("Distance:           " + distance);
       
       double max = Math.max(number1, number2);
       System.out.println("Maximum:            " + max);
       
       double min = Math.min(number1, number2);
       System.out.println("Minimum:            " + min);
       
   }
}
