
/**
 * Write a description of class P10POINT22Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class P10POINT22Frame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;
   
   private P10POINT22Component scene;
   
   class TimerListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
          scene.moveCarBy(1, 1);
      }
   }
   
   public P10POINT22Frame() {
      scene = new P10POINT22Component();
      add(scene);
       
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      ActionListener listener = new TimerListener();
      final int DELAY = 100; // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start(); 
   }
}
