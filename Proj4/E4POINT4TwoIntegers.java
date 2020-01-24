
/**
 * Gives math facts about 2 integers.
 * 
 * @author Zachary Chang
 * @version June 29, 2016
 */
import java.util.Scanner;

public class E4POINT4TwoIntegers
{
   public static void main(String[] args)
   {
       Scanner kboard = new Scanner(System.in);
       
       System.out.println("Give me an integer.");
       double number1 = kboard.nextInt();
       
       System.out.println("Give me another integer.");
       double number2 = kboard.nextInt();
       
       double sum = number1 + number2;
       System.out.println("The sum of your 2 numbers is " + sum);
       
       double difference = number1 - number2;
       System.out.println("The difference of your 2 numbers is " + difference);
       
       double product = number1*number2;
       System.out.println("The product of your 2 numbers is " + product);
       
       double average = (number1 + number2)/2;
       System.out.println("The average of your 2 numbers is " + average);
       
       double distance = Math.abs(difference);
       System.out.println("The distance of your 2 numbers is " + distance);
       
       double max = Math.max(number1, number2);
       System.out.println("The larger of your 2 numbers is " + max);
       
       double min = Math.min(number1, number2);
       System.out.println("The smaller of your 2 numbers is " + min);
       
   }
}
