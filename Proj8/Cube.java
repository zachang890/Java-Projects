
/**
 * Describes methods of a cube class.
 * 
 * @author Zachary Chang
 * @version July 15, 2015
 */
public class Cube
{
    private double h;
    
    public Cube(double height)
    {
        h = height;
    }
    
    public double getCubeVolume()
    {
        double volume = Math.pow(h, 3);
        return volume;
    }
    
    public double getCubeSurface()
    {
        double surfaceArea = h*h*6;
        return surfaceArea;
    }
}
