import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This program constructs the UFOs.
 * @author Zachary Chang
 * @version June 27, 2016
*/
public class SpaceMachineComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      // Draw a UFO at the top-left corner
      int machineLen = 60;               // the length of the UFO
      SpaceMachine sm1 = new SpaceMachine(0, 0, machineLen);
      sm1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      // Draw a spacemachine randomly in the middle third (vertically)
      machineLen = 120;                  // the length of the UFO
      Random randGen = new Random(); // create object for random number generator
      
      int x = randGen.nextInt(right - machineLen);
      int y = randGen.nextInt(bot/3) + bot/3 - machineLen/2;

      SpaceMachine sm2 = new SpaceMachine(x, y, machineLen);
      sm2.draw(g2);      
      
      // Draw a UFO at the bottom-right corner
      machineLen = 200;               // the length of the UFO 
      x = getWidth() - machineLen;    
      y = getHeight() - machineLen/2; 
      SpaceMachine sm3 = new SpaceMachine(x, y, machineLen);
      sm3.draw(g2);      
   }
}
