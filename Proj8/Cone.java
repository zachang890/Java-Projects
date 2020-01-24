
/**
 * Defines methods for a cone.
 * 
 * @author Zachary Chang 
 * @version July 15, 2016
 */
public class Cone
{
    private double r;
    private double h;
    
    public Cone(double radius, double height)
    {
        r = radius;
        h = height;
    }
    
    public double getConeVolume()
    {
        double volume = (1.0/3.0)*h*Math.PI*r*r;
        return volume;
    }
    
    public double getConeSurface()
    {
        double surfaceArea = Math.PI*r*(r + Math.sqrt(h*h+r*r));
        return surfaceArea;
    }
}
