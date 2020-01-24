
/**
 * Write a description of class InvestmentViewer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class InvestmentViewer2
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;
    private static final double INITIAL_BALANCE = 4000;
    private static final double RATE = 60;
    public static void main(String[] args) {
      JFrame frame = new JFrame();
     
      // Prepare the button & add it to the window
      JButton buttonR = new JButton("Add Interest");
      final BankAccount bank = new BankAccount(INITIAL_BALANCE);
      
      final JLabel intLabel = new JLabel("Balance: " + bank.getBalance());
      
      JPanel panel = new JPanel();
      
      panel.add(buttonR);
      panel.add(intLabel);
      frame.add(panel);
      // Prepare the response for when the user clicks the button
    
      class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
          public void actionPerformed(ActionEvent event) { // override this method to respond
              double interest = bank.getBalance() * RATE/100;
              bank.deposit(interest);
              intLabel.setText("Balance: " + bank.getBalance());
          }
      }
        

      // Link the listener to the button
      ActionListener listenerRA = new ClickListener();
      buttonR.addActionListener(listenerRA);
     
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}
