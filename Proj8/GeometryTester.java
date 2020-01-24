
/**
 * Asks for radius and height and prints volumes and surface areas.
 * 
 * @author Zachary Chang 
 * @version July 15, 2016
 */
import java.util.Scanner;

public class GeometryTester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a possible value for the height of various 3D geometric shapes.");
        double height = kboard.nextInt();
        System.out.println("Give me a possible value for the radius of various 3D geometric shapes.");
        double radius = kboard.nextInt();
        
        Cube shape = new Cube(height);
        Sphere shape1 = new Sphere(radius);
        Cylinder shape2 = new Cylinder(radius, height);
        Cone shape3 = new Cone(radius, height);
        
        
        System.out.println("The volume of a cube would be: " + shape.getCubeVolume());
        System.out.println("The surface area of a cube would be: " + shape.getCubeSurface());
        System.out.println("The volume of a sphere would be: " + shape1.getSphereVolume());
        System.out.println("The surface area of a sphere would be: " + shape1.getSphereSurface());
        System.out.println("The volume of a cylinder would be: " + shape2.getCylinderVolume());
        System.out.println("The surface area of a cylinder would be: " + shape2.getCylinderSurface());
        System.out.println("The volume of a cone would be: " + shape3.getConeVolume());
        System.out.println("The surface area of a cone would be: " + shape3.getConeSurface());
    }
}
