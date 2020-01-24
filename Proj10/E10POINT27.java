/**
 * Prints time each second
 * 
 * @author Zachary Chang
 * @version July 22, 2016
 */
import java.util.Date;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.Timer;


public class E10POINT27 extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    class TimerListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            Date now = new Date();
            System.out.println(now);
        }
    }
    
    public E10POINT27()
    {
        ActionListener listener = new TimerListener();
        
        final int DELAY = 1000;
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new E10POINT27();
        frame.setTitle("Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}