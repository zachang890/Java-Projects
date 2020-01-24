import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 100;

   public static void main(String[] args)
   {
      // Prepare the window
       JFrame frame = new JFrame();
      
      // Prepare the button & add it to the window
      JButton button = new JButton("Click me!");
      frame.add(button);

      // Prepare the response for when the user clicks the button
      //final EasySound soundPiece = new EasySound("bells.wav"); // bell sound - must write final for Java version 7 & before
          int count = 0;
          final JLabel label = new JLabel("I was clicked " + count + " times!");
          JPanel panel = new JPanel();
          panel.add(label);
          panel.add(button);
          frame.add(panel);
      class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
          int count = 0;
          
          public void actionPerformed(ActionEvent event) { // override this method to respond
               count++;
               label.setText("I was clicked " + count + " times!");
          }
        }

      // Link the listener to the button
      
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
    }
}

