
/**
 * Defines coin values
 * 
 * @author Zachary Chang & Kevin Zhang 
 * @version July 15, 2016
 */
public class Coin
{
    //fields
    private double value;
    private String name;
    
    //constructors
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }
    
    //methods
    public double getValue()
    {
        return value;
    }
    
    public String getName()
    {
        return name;
    }
}
