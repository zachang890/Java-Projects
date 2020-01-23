import javax.swing.JFrame;

public class SpaceMachineViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(280, 380);
      frame.setTitle("UFO");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SpaceMachineComponent component = new SpaceMachineComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
