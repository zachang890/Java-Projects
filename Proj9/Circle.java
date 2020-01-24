
/**
 * Defines methods for making circles.
 * 
 * @author Zachary Chang 
 * @version July 19, 2016
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class Circle
{
    private double x; 
    private double y;
    private double rad;
    
    public Circle(double xcenter, double ycenter, double radius) {
        x = xcenter - radius;
        y = ycenter - radius;
        rad = radius;
    }
    
    public void draw(Graphics2D g2) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, rad*2, rad*2);
        g2.draw(circle);
    }
}
