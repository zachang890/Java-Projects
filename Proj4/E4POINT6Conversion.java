
/**
 * Converts from meters to miles, feet, and inches.
 * 
 * @author Zachary Chang 
 * @version June 29, 2016
 */
import java.util.Scanner;

public class E4POINT6Conversion
{
    public static final double MILES_VALUE = 0.000621371;
    public static final double FEET_VALUE = 3.28084;
    public static final double INCHES_VALUE = 39.3701;
    
    public static void main(String[] args)
    {
    Scanner kboard = new Scanner(System.in);
    System.out.println("Give me a measurement in meters.");
    double meters = kboard.nextInt();
    
    double miles = meters * MILES_VALUE;
    System.out.println("Your measurement in miles is " + miles);
    double feet = meters * FEET_VALUE;
    System.out.println("Your measurement in feet is " + feet);
    double inches = meters * INCHES_VALUE;
    System.out.println("Your measurement in inches is " + inches);
}
}
