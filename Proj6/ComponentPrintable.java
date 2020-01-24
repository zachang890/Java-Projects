//import java.awt.Color;
import java.awt.Component;
//import java.awt.Dimension;
//import java.awt.Event;
//import java.awt.Font;
//import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Paint;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.KeyEvent;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.font.FontRenderContext;
//import java.awt.font.LineMetrics;
//import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
 
//import javax.swing.AbstractAction;
import javax.swing.JComponent;
//import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.KeyStroke;

class ComponentPrintable implements Printable {
  private Component mComponent;
 
  public ComponentPrintable(Component c) {
    mComponent = c;
  }
 
  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex > 0)
      return NO_SUCH_PAGE;
    Graphics2D g2 = (Graphics2D) g;
    g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    boolean wasBuffered = disableDoubleBuffering(mComponent);
    mComponent.paint(g2);
    restoreDoubleBuffering(mComponent, wasBuffered);
    return PAGE_EXISTS;
  }
 
  private boolean disableDoubleBuffering(Component c) {
    if (c instanceof JComponent == false)
      return false;
    JComponent jc = (JComponent) c;
    boolean wasBuffered = jc.isDoubleBuffered();
    jc.setDoubleBuffered(false);
    return wasBuffered;
  }
 
  private void restoreDoubleBuffering(Component c, boolean wasBuffered) {
    if (c instanceof JComponent)
      ((JComponent) c).setDoubleBuffered(wasBuffered);
  }
}