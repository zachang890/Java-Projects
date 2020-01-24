
/**
 * Tests geometry formula.
 * 
 * @author Zachary Chang 
 * @version July 15, 2016
 */
import java.util.Scanner;
public class Geometry
{
    public static double cubeVolume(double h)
    {
        double volume = Math.pow(h, 3);
        return volume;
    }
    
    public static double cubeSurface(double h)
    {
        double surfaceArea = h*h*6;
        return surfaceArea;
    }
    
    public static double sphereVolume(double r)
    {
        double volume = (4.0/3.0)*Math.PI*r*r*r;
        return volume;
    }
    
    public static double sphereSurface(double r)
    {
        double surfaceArea = 4*Math.PI*r*r;
        return surfaceArea;
    }
    
    public static double cylinderVolume(double r, double h)
    {
        double volume = Math.PI*r*r*h;
        return volume;
    }
    
    public static double cylinderSurface(double r, double h)
    {
        double surfaceArea = 2*r*Math.PI*h*2*Math.PI*r*r;
        return surfaceArea;
    }
    
    public static double coneVolume(double r, double h)
    {
        double volume = (1.0/3.0)*h*Math.PI*r*r;
        return volume;
    }
    
    public static double coneSurface(double r, double h)
    {
        double surfaceArea = Math.PI*r*(r + Math.sqrt(h*h+r*r));
        return surfaceArea;
    }
    
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a possible value for the height of various 3D geometric shapes.");
        double height = kboard.nextInt();
        System.out.println("Give me a possible values for the radius of various 3D geometric shapes.");
        double radius = kboard.nextInt();
        
        System.out.println("The volume of a cube would be: " + cubeVolume(height));
        System.out.println("The surface area of a cube would be: " + cubeSurface(height));
        System.out.println("The volume of a sphere would be: " + sphereVolume(radius));
        System.out.println("The surface area of a sphere would be: " + sphereSurface(radius));
        System.out.println("The volume of a cylinder would be: " + cylinderVolume(radius, height));
        System.out.println("The surface area of a cylinder would be: " + cylinderSurface(radius, height));
        System.out.println("The volume of a cone would be: " + coneVolume(radius, height));
        System.out.println("The surface area of a cone would be: " + coneSurface(radius, height));
    }
}

