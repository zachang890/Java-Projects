 import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
   This component draws stars.
*/
public class ReportComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      // The following is for you to place things in the right place
      // Delete these rectangles before you finalize your image
      
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(new Rectangle(0, 0, 480, 700)); // paper
      g2.draw(new Rectangle(0, 450, 480, 250)); // leave this area blank (for teacher)
      
      
      // Show image at top-right area
      BufferedImage img = null; 
      try {

          img = ImageIO.read(new File("rsz_myimage.png")); // specify file name of the image here
        } 
        catch (IOException e) { 
        }

        int x = 275, y = 0;
        if (img != null && g2.drawImage(img, x, y, null));


      
      // ... HAVE YOUR CODE HERE
      
        Color black = new Color(0, 0, 0);//standard color
        Color white = new Color(255, 255, 255);//standard color
        
        Ellipse2D.Double aOuterCircle = new Ellipse2D.Double (10, 25, 50, 50);
        g2.draw(aOuterCircle);
        g2.setColor(black);
        g2.fill(aOuterCircle);
        
        Ellipse2D.Double aInnerCircle = new Ellipse2D.Double (22, 36, 25, 25);
        g2.draw(aInnerCircle);
        g2.setColor(white);
        g2.fill(aInnerCircle);
        
        Rectangle aRectangle = new Rectangle (50, 27, 13, 48);
        g2.draw(aRectangle);
        g2.setColor(black);
        g2.fill(aRectangle);
        
        Rectangle tHoriRectangle = new Rectangle (73, 27, 30, 13);
        g2.draw(tHoriRectangle);
        g2.setColor(black);
        g2.fill(tHoriRectangle);
        
        Rectangle tVertiRectangle = new Rectangle (81, 14, 13, 61);
        g2.draw(tVertiRectangle);
        g2.setColor(black);
        g2.fill(tVertiRectangle);
        
        Ellipse2D.Double dOuterCircle = new Ellipse2D.Double(113, 27, 50, 50);
        g2.draw(dOuterCircle);
        g2.setColor(black);
        g2.fill(dOuterCircle);
        
        Ellipse2D.Double dInnerCircle = new Ellipse2D.Double(125, 38, 25, 25);
        g2.draw(dInnerCircle);
        g2.setColor(white);
        g2.fill(dInnerCircle);
        
        Rectangle dRect = new Rectangle(151, 2, 13, 76);
        g2.draw(dRect);
        g2.setColor(black);
        g2.fill(dRect);
        
        Rectangle pRect = new Rectangle(171, 27, 13, 76);
        g2.draw(pRect);
        g2.setColor(black);
        g2.fill (pRect);
        
        Ellipse2D.Double pOuterCircle = new Ellipse2D.Double(171, 27, 50, 50);
        g2.draw(pOuterCircle);
        g2.setColor(black);
        g2.fill(pOuterCircle);
        
        Ellipse2D.Double pInnerCircle = new Ellipse2D.Double(183, 38, 25, 25);
        g2.draw(pInnerCircle);
        g2.setColor(white);
        g2.fill(pInnerCircle);
        
        g2.setColor(Color.BLACK);
        
        g2.drawString("Course: SD 3635.1 – Programming in Java", 5, 200);
        g2.drawString("Grade report, 7/8/2016", 5, 225);
        g2.drawString("Student: Zachary Chang", 5, 250);
        
        double grade = 97.01; //enter grade here. This value is for testing purposes only.
        if (grade >= 97) {
            g2.drawString("Grade: A+" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 93 && grade < 97) {
            g2.drawString("Grade: A" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 90 && grade < 93) {
            g2.drawString("Grade: A-" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 87 && grade < 90) {
            g2.drawString("Grade: B+" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 83 && grade < 87) {
            g2.drawString("Grade: B" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 80 && grade < 83) {
            g2.drawString("Grade: B-" + ", " + grade, 5, 275);
        }
        
        else if (grade >= 65 && grade < 80) {
            g2.drawString("Grade: PASS" + ", " + grade, 5, 275);
        }
        
        else {
            g2.drawString("Grade: NO PASS" + ", " + grade, 5, 275);
        }
        Rectangle sig = new Rectangle(10, 290, 330, 30);
        g2.draw(sig);
        g2.setColor(white);
        g2.fill(sig);
        
        
        Rectangle date = new Rectangle(340, 290, 100, 30);
        g2.draw(date);
        g2.setColor(white);
        g2.fill(date);
        g2.setColor(Color.BLACK);
        g2.drawString("Date: ", 350, 310);
        g2.drawString("Signature by parent/guardian: ", 10, 310);
        
        g2.drawString("Comments by teacher: ", 10, 480);
        Rectangle comments = new Rectangle(0, 500, 480, 200);
        g2.draw(comments);
   }
}
