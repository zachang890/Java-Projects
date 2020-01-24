
/**
 * Shows the parts to the viewer to display in the console window.
 * 
 * @author Zachary Chang 
 * @version July 19, 2016
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.util.Scanner;
import java.awt.geom.Ellipse2D;


public class OlympicComponent extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Scanner kboard = new Scanner(System.in);
        /**
        System.out.println("Give me the values of the center(x-coordinate and y-coordinate) and the radius of the black ring of the Olympics logo (press enter after each).");
        double one = kboard.nextDouble();
        double two = kboard.nextDouble();
        double three = kboard.nextDouble();
        OlympicLogo logo1 = new OlympicLogo(one, two, three);
        System.out.println("Give me the values of the center(x-coordinate and y-coordinate) and the radius of the black ring of the Olympics logo (press enter after each).");
        double four = kboard.nextDouble();
        double five = kboard.nextDouble();
        double six = kboard.nextDouble();
        OlympicLogo logo2 = new OlympicLogo(four, five, six);
        System.out.println("Give me the values of the center(x-coordinate and y-coordinate) and the radius of the black ring of the Olympics logo (press enter after each).");
        double seven = kboard.nextDouble();
        double eight = kboard.nextDouble();
        double nine = kboard.nextDouble();
        OlympicLogo logo3 = new OlympicLogo(seven, eight, nine);
        logo1.draw(g2);
        logo2.draw(g2);
        logo3.draw(g2);
        **/
        
        OlympicLogo logo1 = new OlympicLogo((double)(Math.random() * ((400) + 1)),(int)(Math.random() * ((700) + 1)), 10 + (int)(Math.random() * ((90) + 1)));
        logo1.draw(g2);
        OlympicLogo logo2 = new OlympicLogo((double)(Math.random() * ((400) + 1)),(int)(Math.random() * ((700) + 1)), 10 + (int)(Math.random() * ((90) + 1)));
        logo2.draw(g2);
        OlympicLogo logo3 = new OlympicLogo((double)(Math.random() * ((400) + 1)),(int)(Math.random() * ((700) + 1)), 10 + (int)(Math.random() * ((90) + 1)));
        logo3.draw(g2);
    }
}
