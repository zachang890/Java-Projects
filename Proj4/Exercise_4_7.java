import java.util.Scanner;
import java.lang.Math;
/**
 * Prints certain values based on the radius
 *
 * @author Sravan
 * @version 6/29
 */
public class Exercise_4_7
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Write down a radius value");
        double value1 = kboard.nextDouble();
        
        double circum = 2 * value1 * Math.PI;
        double area = value1*value1 * Math.PI;
        double volume = (4*(value1 * value1 * value1) * Math.PI)/3; 
        double surface = 4 * value1 * value1 * Math.PI;
        
        System.out.println("Circumference : " + circum);
        System.out.println("Area          : " + area);
        System.out.println("Volume        : " + volume);
        System.out.println("Surface Area  : " + surface);
    }
}