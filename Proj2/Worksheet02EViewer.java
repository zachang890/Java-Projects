
/**
 * Sets the frame of the drawing.
 * 
 * @author Zachary Chang
 * @version June 24, 2016
 */
import javax.swing.JFrame;

public class Worksheet02EViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 400);
      frame.setTitle("Thunder Monster in the Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Worksheet02EComponents component = new Worksheet02EComponents();
      frame.add(component);

      frame.setVisible(true);
   }
}