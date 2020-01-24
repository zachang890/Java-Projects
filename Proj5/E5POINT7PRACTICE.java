
/**
 * Write a description of class wdwd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class E5POINT7PRACTICE
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Give me an integer");
        int first = kboard.nextInt();
        
        System.out.println("Give me another integer");
        int second = kboard.nextInt();
        
        System.out.println("Give me another integer");
        int third = kboard.nextInt();
        
        if (first - second < 0 && second - third < 0) {
            System.out.println("in order");
        }
        
        else if (first - second > 0 && second - third > 0) {
            System.out.println("in order");
        }
        
        else {
            System.out.println("not in order");
        }
    }
}
