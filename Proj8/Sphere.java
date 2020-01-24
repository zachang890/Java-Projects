    
/**
 * Defines methods for a sphere
 * 
 * @author Zachary Chang 
 * @version July 15, 2016
 */
public class Sphere
{
    private double r;
    
    public Sphere(double radius)
    {
        r = radius;
    }
    
    public double getSphereVolume()
    {
        double volume = (4.0/3.0)*Math.PI*r*r*r;
        return volume;
    }
    
    public double getSphereSurface()
    {
        double surfaceArea = 4*Math.PI*r*r;
        return surfaceArea;
    }
}
