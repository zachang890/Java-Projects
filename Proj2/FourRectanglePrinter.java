
/**
 * Write a description of class FourRectanglePrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class FourRectanglePrinter
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(0, 0, 5, 10);
        System.out.println(box);
        System.out.print(" ");
        box.translate(5, 0);
        System.out.println(box);
        System.out.print(" ");
        box.translate(-5, 10);
        System.out.println(box);
        System.out.print(" ");
        System.out.print(" ");
        box.translate(5, 0);
        System.out.println(box);
        
        
   
}
}
