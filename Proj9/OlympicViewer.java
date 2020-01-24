
/**
 * Shows the console window for the olympic logos
 * 
 * @author Zachary Chang 
 * @version July 19, 2016
 */
import javax.swing.JFrame;

public class OlympicViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 700);
      frame.setTitle("Three Olympic Logos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicComponent component = new OlympicComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
