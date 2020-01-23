
/**
 * Displays the constructors and methods of the BMICalculator class.
 * 
 * @author Zachary Chang 
 * @version June 29, 2016
 */


public class BMICalculator
{
    public static final double KG_VALUE = 0.453592;
    public static final double METERS_VALUE = 0.0254;
    // instance variables - replace the example below with your own
    private String title;
    private int young;
    private double light;
    private double small;
    private double bmi;

    /**
     * Constructor for objects of class BMICalculator
     */
    public BMICalculator(String person, int old, double heavy, double tall)
    {
        // initialise instance variables
        title = person;
        young = old;
        light = heavy;
        small = tall;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getKg(double light)
    {
        // put your code here
        light = light * KG_VALUE;
        return light;
    }
    
    public double getM(double small)
    {
        small = small * METERS_VALUE;
        return small;
    }    
    
    public double getBmi(double convertkg, double convertmt)
    {
        bmi = convertkg/Math.pow(convertmt, 2);
        return bmi;
    }    
}
