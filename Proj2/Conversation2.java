
/**
 * A conversation
 * 
 * @author Jaiveer Singh and Zachary Chang 
 * @version June 22, 2016
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("What is your name? "); // Ask user
    String name = kboard.nextLine();         // Accept answer from user
    
    System.out.println("Hello, " + name);
    System.out.println("What is your zip code?");
    int address = kboard.nextInt(); 
    
    System.out.print("\nHow long does it take to go to " + address + " from UC Berkeley (in minutes)? "); // Ask user
    double time = kboard.nextInt();
             // Accept answer from user 
             
    double hours = time/60;    
    System.out.println("Just confirming that your house is " + hours + " hours away from UC Berkeley.");    
    
    
    
    kboard.close(); // Done using the keyboard
  }
}
