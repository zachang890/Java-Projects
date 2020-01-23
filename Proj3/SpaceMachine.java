import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Specifies the details of making the UFOs.
 * 
 * @author Zachary Chang
 * @verion June 27, 2016
*/
public class SpaceMachine
{
   private int xLeft;
   private int yTop;
   private int delta;

   /**
      Constructs a UFO with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param approxLen the approximate length of the UFO; the  height is half of the length
   */
   public SpaceMachine(int x, int y, int approxLen)
   {
      xLeft = x;
      yTop = y;
      delta = approxLen / 6;
   }

   /**
      Draws the UFO
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      // The UFO body
       Rectangle body = new Rectangle(xLeft, yTop + delta, delta*6, delta); 
       
      //UFO capsule
      Ellipse2D.Double capsule = new Ellipse2D.Double(xLeft + delta*2, yTop, delta*2, delta*2);
      
      // The Spotlights
      Ellipse2D.Double spotlight = new Ellipse2D.Double(xLeft, yTop + delta, delta, delta); 
      Ellipse2D.Double spotlight2 = new Ellipse2D.Double(xLeft + delta * 5, yTop + delta, delta, delta);
      
      //Landing gear
      Rectangle gear1 = new Rectangle(xLeft + delta, yTop + delta*2, delta, delta);
      Rectangle gear2 = new Rectangle(xLeft + delta*4, yTop + delta*2, delta, delta);
      
      // Draw the entire car
      g2.draw(body);
      g2.draw(capsule);
      g2.draw(spotlight);
      g2.draw(spotlight2); 
      g2.draw(gear1);
      g2.draw(gear2);
   }
}
