
/**
 * This proram draws the ATDP logo.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;


public class ATDPLogoComponents extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Color black = new Color(0, 0, 0);//standard color
        Color white = new Color(255, 255, 255);//standard color
        
        Ellipse2D.Double aOuterCircle = new Ellipse2D.Double (80, 80, 60, 60);
        g2.draw(aOuterCircle);
        g2.setColor(black);
        g2.fill(aOuterCircle);
        
        Ellipse2D.Double aInnerCircle = new Ellipse2D.Double (95, 95, 30, 30);
        g2.draw(aInnerCircle);
        g2.setColor(white);
        g2.fill(aInnerCircle);
        
        Rectangle aRectangle = new Rectangle (125, 80, 15, 60);
        g2.draw(aRectangle);
        g2.setColor(black);
        g2.fill(aRectangle);
        
        Rectangle tHoriRectangle = new Rectangle (155, 80, 45, 15);
        g2.draw(tHoriRectangle);
        g2.setColor(black);
        g2.fill(tHoriRectangle);
        
        Rectangle tVertiRectangle = new Rectangle (170, 65, 15, 75);
        g2.draw(tVertiRectangle);
        g2.setColor(black);
        g2.fill(tVertiRectangle);
    }
}
