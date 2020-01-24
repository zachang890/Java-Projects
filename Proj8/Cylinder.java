
/**
 * Defines methods for a cylinder
 * 
 * @author Zachary Chang 
 * @version July 15, 2016
 */
public class Cylinder
{
    private double r;
    private double h;
    
    public Cylinder(double radius, double height)
    {
        r = radius;
        h = height;
    }
    
    public double getCylinderVolume()
    {
        double volume = Math.PI*r*r*h;
        return volume;
    }
    
    public double getCylinderSurface()
    {
        double surfaceArea = 2*r*Math.PI*h*2*Math.PI*r*r;
        return surfaceArea;
    }
    
}
