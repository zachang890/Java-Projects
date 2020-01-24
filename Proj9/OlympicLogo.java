
/**
 * Defines methods for making the olympic logo.
 * 
 * @author Zachary Chang 
 * @version July 19, 2016
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class OlympicLogo extends Circle
{
    private double x;
    private double y;
    private double rad;
    
    public OlympicLogo(double xcenter, double ycenter, double radius) {
        super(xcenter, ycenter, radius);
        x = xcenter;
        y = ycenter;
        rad = radius;
    }
    
    public void draw(Graphics2D g2)
    {
        Circle num1 = new Circle(x - rad*2.25, y, rad);
        Circle num2 = new Circle(x, y, rad);
        Circle num3 = new Circle(x + rad*2.25, y, rad);
        Circle num4 = new Circle(x - rad*1.1, y + rad*1.25, rad);
        Circle num5 = new Circle(x + rad*1.1, y + rad*1.25, rad);
        num1.draw(g2);
        num2.draw(g2);
        num3.draw(g2);
        num4.draw(g2);
        num5.draw(g2);
    }
}
