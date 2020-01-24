import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.util.ArrayList;
/**
   This component displays a rectangle that can be moved. 
*/
public class RectangleComponent2 extends JComponent
{
   /*
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;

   private Rectangle box;

   public RectangleComponent2()
   {  
      // The rectangle that the paintComponent method draws 
      box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);         
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      g2.draw(box);
   }

   /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   /*
   public void moveRectangleTo(int x, int y)
   {
      box.setLocation(x, y);
      repaint();      
   }*/
   
 

/**
   This component displays a rectangle that can be moved. 
*/


   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 40;
   private static final int BOX_HEIGHT = 50;
   private ArrayList<Rectangle> box1;

   private Rectangle box;

   public RectangleComponent2()
   {  
      // The rectangle that the paintComponent method draws 
      box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);  
      box1 = new ArrayList<Rectangle>();
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      box1.add(box);
      for(Rectangle e: box1){
          g2.draw(e);
        }
   }

   public void moveRectangleTo(int x, int y)
   {
      box.setLocation(x, y);
      repaint();      
   }
   
   public void addRectangle(int x, int y) {
       Rectangle x1 = new Rectangle(x,y,BOX_WIDTH, BOX_HEIGHT);
       box1.add(x1);
       repaint();
   }
}
