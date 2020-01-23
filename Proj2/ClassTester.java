
/**
 * This is to test the Rectangle class.
 * 
 * @author Zachary Chang 
 * @version June 24, 2016
 */
import java.awt.Rectangle;

public class ClassTester
{
    public static void main(String[] args){
        int x = 5, y = 10, w = 20, h = 30;
        Rectangle box1 = new Rectangle(x, y, w, h);
        
        double bw = box1.getWidth();
        System.out.println("New width = " + bw);
        System.out.println("...expect = " + 20);
        System.out.println("          ");
        
        double bh = box1.getHeight();
        System.out.println("New height = " + bh);
        System.out.println("...expect = " + 30);
        
        System.out.println(" ");
        System.out.println("New area = " + bw * bh);
        System.out.println("...expect = " + 600);
        
        System.out.println(" ");
        System.out.println("New perimeter = " + (bw + bw + bh + bh));
        System.out.println("...expect = " + 100);
    }
}
