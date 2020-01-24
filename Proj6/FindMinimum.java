
/**
 * Finds the minimum number.
 * 
 * @author Zachary Chang 
 * @version July 8, 2016
 */
import java.util.Scanner;

public class FindMinimum
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a number");
        int number = kboard.nextInt();
        
        int minNum = 0;
        int count = 0;
        int next = 0;
        
        while(kboard.hasNextInt()) {
            if(kboard.hasNextInt() && count == 0) {
                minNum = number;
                System.out.println("Give me another number or press q to quit");
                next = kboard.nextInt();
                count++;
            }
            
            
            else if (next < minNum) {
                minNum = next;
                System.out.println("Give me another number or press q to quit");
                next = kboard.nextInt();
                count++;
            }
             
            }
            System.out.println("The minimum number is: " + minNum);
        }
       
    }

