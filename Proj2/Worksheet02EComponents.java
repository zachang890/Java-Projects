
/**
 * Components and shapes of the drawing.
 * 
 * @author Zachary Chang
 * @version June 24, 2016
*/ 

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;


/*
   A component that draws two rectangles.
*/   

public class Worksheet02EComponents extends JComponent
{
   public void paintComponent(Graphics g)
   {
     Graphics2D g2 = (Graphics2D) g;
     
     Color blue = new Color(0, 0, 255);//standard color
     Color darkgray = new Color(64, 64, 64);//standard color
     Color black = new Color(0, 0, 0);//standard color
     Color lightgray = new Color(192, 192, 192);//standard color
     Color white = new Color(255, 255, 255);//standard color
     Color pink = new Color(255, 175, 175);//standard color
     Color red = new Color(255, 0, 0);//standard color
     Color darkwhite = new Color(230, 230, 230);//custom color
     Color peach = new Color(235, 160, 0);//custom color
     Color brown = new Color(155, 90, 80);//custom color
     
     Rectangle box2 = new Rectangle(0, 0, 383, 360);
     g2.draw(box2);
     g2.setColor(blue);
     g2.fill(box2);
     
     Rectangle box = new Rectangle(20, 185, 165, 165);
     g2.draw(box);
     g2.setColor(darkgray);
     g2.fill(box);
     
     box.translate(0, -175);
     g2.draw(box);
     g2.setColor(darkgray);
     g2.fill(box);
     
     box.translate(175, 0);
     g2.draw(box);
     g2.setColor(darkgray);
     g2.fill(box);
     
     box.translate(0, 175);
     g2.draw(box);
     g2.setColor(darkgray);
     g2.fill(box);
     
     Rectangle box3 = new Rectangle(25, 190, 20, 40);
     g2.draw(box3);
     g2.setColor(lightgray);
     g2.fill(box3);
     
     box3.grow(5, 5);
     g2.draw(box3);
     g2.setColor(black);
     g2.fill(box3);
     
     Ellipse2D.Double cloud = new Ellipse2D.Double(30, 30, 60, 30);
     g2.draw(cloud);
     g2.setColor(lightgray);
     g2.fill(cloud);
     
     Ellipse2D.Double cloud2 = new Ellipse2D.Double(60, 40, 80, 25);
     g2.draw(cloud2);
     g2.setColor(lightgray);
     g2.fill(cloud2);
     
     Ellipse2D.Double cloud3 = new Ellipse2D.Double(120, 20, 30, 10);
     g2.draw(cloud3);
     g2.setColor(lightgray);
     g2.fill(cloud3);
     
     Ellipse2D.Double cloud4 = new Ellipse2D.Double(240, 20, 70, 23);
     g2.draw(cloud4);
     g2.setColor(lightgray);
     g2.fill(cloud4);
     
     Ellipse2D.Double cloud5 = new Ellipse2D.Double(200, 30, 70, 30);
     g2.draw(cloud5);
     g2.setColor(lightgray);
     g2.fill(cloud5);
     
     Ellipse2D.Double moon = new Ellipse2D.Double(300, 40, 50, 50);
     g2.draw(moon);
     g2.setColor(darkwhite);
     g2.fill(moon);
     
     Ellipse2D.Double head = new Ellipse2D.Double(300, 300, 100, 100);
     g2.draw(head);
     g2.setColor(peach);
     g2.fill(head);
     
     Ellipse2D.Double eye = new Ellipse2D.Double(315, 315, 10, 20);
     g2.draw(eye);
     g2.setColor(white);
     g2.fill(eye);
     
     Ellipse2D.Double eyeinside = new Ellipse2D.Double(314, 320, 5, 10);
     g2.draw(eyeinside);
     g2.setColor(black);
     g2.fill(eyeinside);
     
     Ellipse2D.Double mouth = new Ellipse2D.Double(305, 350, 10, 10);
     g2.draw(mouth);
     g2.setColor(pink);
     g2.fill(mouth);
     
     Ellipse2D.Double monsterhead = new Ellipse2D.Double(55, 274, 75, 75);
     g2.draw(monsterhead);
     g2.setColor(black);
     g2.fill(monsterhead);
     
     Ellipse2D.Double monstereye1 = new Ellipse2D.Double(70, 285, 15, 15);
     g2.draw(monstereye1);
     g2.setColor(white);
     g2.fill(monstereye1);
     
     Ellipse2D.Double monstereye2 = new Ellipse2D.Double(100, 285, 15, 15);
     g2.draw(monstereye2);
     g2.setColor(white);
     g2.fill(monstereye2);
     
     Ellipse2D.Double nose = new Ellipse2D.Double(87, 305, 10, 10);
     g2.draw(nose);
     g2.setColor(white);
     g2.fill(nose);
     
     Ellipse2D.Double monsterear1 = new Ellipse2D.Double(55, 270, 15, 15);
     g2.draw(monsterear1);
     g2.setColor(black);
     g2.fill(monsterear1);
     
     Ellipse2D.Double monsterear2 = new Ellipse2D.Double(115, 270, 15, 15);
     g2.draw(monsterear2);
     g2.setColor(black);
     g2.fill(monsterear2);
     
     int[] xCoords = {220, 200, 250, 270};
     int[] yCoords = {300, 340, 340, 300};
     Polygon welcomemat = new Polygon(xCoords, yCoords, 4);
     g2.draw(welcomemat);
     g2.setColor(red);
     g2.fill(welcomemat);
     
     Ellipse2D.Double stone1 = new Ellipse2D.Double(235, 270, 30, 15);
     g2.draw(stone1);
     g2.setColor(brown);
     g2.fill(stone1);
     
     Ellipse2D.Double stone2 = new Ellipse2D.Double(260, 250, 30, 15);
     g2.draw(stone2);
     g2.setColor(brown);
     g2.fill(stone2);
     
     Ellipse2D.Double stone3 = new Ellipse2D.Double(285, 235, 30, 15);
     g2.draw(stone3);
     g2.setColor(brown);
     g2.fill(stone3);
     
     Ellipse2D.Double stone4 = new Ellipse2D.Double(310, 220, 30, 15);
     g2.draw(stone4);
     g2.setColor(brown);
     g2.fill(stone4);
     
     g2.drawString("I'm here...", 135, 290);
     
     Line2D.Double strike = new Line2D.Double(55, 60, 63, 85);
     g2.draw(strike);
     
     Line2D.Double strike2= new Line2D.Double(63, 85, 50, 110);
     g2.draw(strike2);
     
     Line2D.Double strike3 = new Line2D.Double(50, 110, 70, 135);
     g2.draw(strike3);
     
     Line2D.Double strike4 = new Line2D.Double(56, 97, 80, 110);
     g2.draw(strike4);
     
     Line2D.Double strike5 = new Line2D.Double(80, 110, 76, 120);
     g2.draw(strike5);
     
     Line2D.Double strike6 = new Line2D.Double(110, 66, 95, 95);
     g2.draw(strike6);
     
     Line2D.Double strike7 = new Line2D.Double(95, 95, 115, 130);
     g2.draw(strike7);
     
     Line2D.Double strike8 = new Line2D.Double(115, 130, 100, 150);
     g2.draw(strike8);
     
     Line2D.Double strike9 = new Line2D.Double(240, 62, 250, 90);
     g2.draw(strike9);
     
     Line2D.Double strike10 = new Line2D.Double(250, 90, 235, 105);
     g2.draw(strike10);
     
     Line2D.Double strike11 = new Line2D.Double(235, 105, 242, 125);
     g2.draw(strike11);
   }
}

    

