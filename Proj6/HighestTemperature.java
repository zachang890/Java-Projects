
/**
 * Finds the month with the highest temperature.
 * 
 * @author Zachary Chang
 * @version July 9, 2016
 */
import java.util.Scanner;

public class HighestTemperature
{
    public static void main(String[] args) {
    Scanner kboard = new Scanner(System.in);
    double maxVal = 0;
    int count = 1;
    int position = 1;
    System.out.println("Give me a temperature value that is a decimal or press Q to quit.");
    double val = kboard.nextDouble();
    System.out.println("That was just a test. Now let us start :D Give me another or press Q to quit.");
    if(kboard.hasNextDouble()) {
        while(count <= 12) {
        maxVal = Math.max(maxVal, val);
        System.out.println("Give me a temperature value that is a decimal.");
        
        if (kboard.hasNextDouble()) {
            val = kboard.nextDouble();
            System.out.println("" + val);
            System.out.println("Month " + position);
            position++;
            count++;
        }
        else {
            System.out.println("Bye");
            break;
        }
        
     }
    
      kboard.nextLine();
    
      System.out.println("Highest Value: " + maxVal);
      System.out.println("Which month gave the maximum value?");
      String next = kboard.nextLine();
      System.out.println("Highest Month: " + next);
      System.out.println("Highest Value: " + maxVal);
    }
    else {
        System.out.println("Bye");
        
    }
  }
}


