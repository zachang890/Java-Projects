
/**
 * Finds the sum and average of a group of numbers.
 * 
 * @author Zachary Chang 
 * @version July 8, 2016
 */
import java.util.Scanner;

public class SumAndAverage
{
    public static void main(String[] args) 
    { 
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a number or press q to quit");
        double firstNum = kboard.nextInt();
        
        double count = 0;
        double sum = 0;
        while(kboard.hasNextInt()) {
            if (kboard.hasNextInt() && count == 0) {
                sum = sum + firstNum;
                count++;
            }
            
            else {
                System.out.println("Give me another number or press q to quit");
                double number = kboard.nextInt();
                sum = sum + number;
                count++;
            }
        }
        System.out.println("The sum is " + sum + ".");
        double average = sum/count;
        System.out.println("The average is " + average + ".");
    }
}
