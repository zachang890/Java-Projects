
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
//import java.util.EventObject;
/**
   This program demonstrates how to install an action listener.
*/
public class E10POINT18
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 100;

   public static void main(String[] args)
   {
      // Prepare the window
       JFrame frame = new JFrame();
    
      // Prepare the button & add it to the window
      JButton buttonR = new JButton("Right Answer!");
      
      
      JButton buttonW = new JButton("Wrong Answer!");
      
      JPanel panel = new JPanel();
      panel.add(buttonR);
      panel.add(buttonW);
      frame.add(panel);
      // Prepare the response for when the user clicks the button
      
      class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
          int count = 0;
          int count1 = 0;
          public void actionPerformed(ActionEvent event) { // override this method to respond
              Object obj = event.getSource();
              if (obj == buttonR) {
                count++;
                System.out.println("Right Answer was clicked " + count + " times!");
                }
              else if (obj == buttonW) {
                count1++;
                System.out.println("Wrong Answer was clicked " + count1 + " times!");
                }
              
          }
      }
        

      // Link the listener to the button
      ActionListener listenerRA = new ClickListener();
      buttonR.addActionListener(listenerRA);
      
      ActionListener listenerWA = new ClickListener();
      buttonW.addActionListener(listenerWA);
     
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      
   }
}