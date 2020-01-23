
/**
 * Write a description of class IfElse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
       Scanner kboard = new Scanner(System.in);
       System.out.println("Do you like to eat pie?");
       String input = kboard.nextLine();
       if(input.equals("yes")){
           System.out.println("Great!");
        }
       else {
           System.out.println("That's too bad");
        }
    }
}
