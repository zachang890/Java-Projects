
/**
 * Creates a rectangle with A = 42 and a rectangle with P = 42. Prints the lengths and the widths.
 * 
 * @author Zachary Chang 
 * @version Due June 24, 2016
 */
import java.awt.Rectangle;

public class E2POINT4Rectangle
{
   public static void main(String[] args)
   {
       Rectangle box = new Rectangle(15, 15, 6, 7);
       Rectangle box2 = new Rectangle(15, 25, 15, 6);
       
       System.out.println("Width of rectangle with area 42: " + box.getWidth());
       System.out.println("Height of rectangle with area 42: " + box.getHeight());
       System.out.println("Width of rectangle with perimeter 42: " + box2.getWidth());
       System.out.println("Height of rectangle with perimeter 42: " + box2.getHeight());
    }
}
