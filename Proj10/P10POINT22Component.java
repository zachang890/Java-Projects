
/**
 * Write a description of class P10POINT22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class P10POINT22Component extends JComponent
{
   private int X_LEFT = 100;
   private int Y_TOP = 100;
   private int APPROX_LEN = 20;
   private int delta;
   
   private Car car;
    public P10POINT22Component()
    {
        car = new Car(X_LEFT, Y_TOP, APPROX_LEN);
        delta = 60/6;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
         // The car body
       Rectangle body = new Rectangle(X_LEFT, Y_TOP + delta, delta*6, delta);      
      
      // The 2 tires
      Ellipse2D.Double frontTire = new Ellipse2D.Double(X_LEFT + delta, Y_TOP + delta*2, delta, delta);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(X_LEFT + delta*4, Y_TOP + delta*2, delta, delta);

      // The point at the bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(X_LEFT + delta, Y_TOP + delta);
      // The  point at the front of the roof
      Point2D.Double r2 = new Point2D.Double(X_LEFT + delta*2, Y_TOP);
      // The  point at the rear of the roof
      Point2D.Double r3 = new Point2D.Double(X_LEFT + delta*4, Y_TOP);
      // The  point at the bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(X_LEFT + delta*5, Y_TOP + delta);

      // The lines for front windshield, roof, & rear windshield
      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
   
     // Draw the entire car
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);      
      g2.draw(roofTop);      
      g2.draw(rearWindshield);
    }
    
    public void moveCarBy(int dx, int dy)
    {
        X_LEFT = X_LEFT + dx;
        Y_TOP = Y_TOP+ dy;
        repaint();
    }
}
