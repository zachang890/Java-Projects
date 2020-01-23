
/**
 * Prints expected and actual values of Rectangle
 * 
 * @author Zachary Chang and Jaiveer Singh
 * @version June 24, 2016
 */
import java.awt.Rectangle;

public class AddTester
{
  public static void main(String[] args)
  {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      box.add(0,0);
      System.out.println(box.getX());
      System.out.println("...expected = " + 0);
      System.out.println(" ");
      System.out.println(box.getY());
      System.out.println("...expected = " + 0);
      System.out.println(" ");
      System.out.println(box.getWidth());
      System.out.println("...expected = " + 25);
      System.out.println(" ");
      System.out.println(box.getHeight());
      System.out.println("...expected = " + 40);
    }
}
