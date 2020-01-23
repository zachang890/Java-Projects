
/**
 * Uses radius to calculate area, circumference, volume, and surface area.
 * 
 * @author Zachary Chang 
 * @version June 29, 2016
 */
import java.util.Scanner;

public class E4POINT7Radius
{
    public static void main(String[] args)
    {
    Scanner kboard = new Scanner(System.in);
    System.out.println("Type a radius measurement.");
    double radius = kboard.nextInt();
    
    double area = Math.PI*radius*radius;
    System.out.println("The area of a circle with this radius is " + area);
    
    double circumference = Math.PI*radius*2;
    System.out.println("The circumference of a circle with this radius is " + circumference);
    
    double volume = (4.0/3.0)*Math.PI*radius*radius*radius;
    System.out.println("The volume of a sphere with this radius is " + volume);
    
    double surface = Math.PI*4*radius*radius;
    System.out.println("The surface area of a sphere with this radius is " + surface);
}
}
