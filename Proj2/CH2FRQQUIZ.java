
/**
 * Calculates areas with normal and doubled heights and widths of a rectangle with a height of 3 and a width of 4. FRQ Quiz Chapter 2
 *  
 * @author Zachary Chang 
 * @version June 27, 2016
 */
import java.awt.Rectangle;

public class CH2FRQQUIZ
{
  public static void main(String[] args)
  {
      Rectangle box = new Rectangle(4, 4, 4, 3);
      System.out.println("Original width, original height = " + box.getWidth() + ", " + box.getHeight());
      System.out.println("... expected 4.0, 3.0");
      
      //Normal width and normal height
      double area = box.getWidth() * box.getHeight();
      System.out.println("Area = " + area);
      System.out.println("...expected 12.0");
      System.out.println(" ");
      
      //Doubled width and normal height
      double doublewidth = box.getWidth() * 2;
      double doublewidtharea = doublewidth * box.getHeight();
      System.out.println("Doubled width, original height = " + doublewidth + ", " + box.getHeight());
      System.out.println("... expected 8.0, 3.0");
      System.out.println("Area = " + doublewidtharea);
      System.out.println("...expected 24.0");
      System.out.println(" ");
      
      //Normal width and doubled height
      double doubleheight = box.getHeight() * 2;
      double doubleheightarea = doubleheight * box.getWidth();
      System.out.println("Original width, doubled height = " + box.getWidth() + ", " + doubleheight);
      System.out.println("...expected 4.0, 6.0");
      System.out.println("Area = " + doubleheightarea);
      System.out.println("...expected 24.0");
      System.out.println(" ");
      
      //Doubled width and doubled height
      double doubleheightwidtharea = doubleheight * doublewidth;
      System.out.println("Doubled width, doubled height = " + doublewidth + ", " + doubleheight);
      System.out.println("...expected 8.0, 6.0");
      System.out.println("Area = " + doubleheightwidtharea);
      System.out.println("...expected 48.0");
      
      //Exploration: When one side is doubled, the original area is doubled. However, when both sides are doubled, the resulting area is four times the original area.
  }
}
