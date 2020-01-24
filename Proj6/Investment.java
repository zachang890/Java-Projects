
/**
 * This program defines the methods and constructor for an investment class.
 * 
 * @author Zachary Chang 
 * @version July 6, 2016
 */
public class Investment
{
    //Fields
    private double initAmt;
    private double intRate;
    private int years;
    //Constructor
    public Investment(double begAmt, double rate) {
        initAmt = begAmt;
        intRate = rate;
        years = 0;
    }
    //Method
    public void waitForBalance(double targetAmt) {
        double amt = initAmt;
        years = 0;
        while (amt <= targetAmt) {
            amt += amt*(1+intRate);
            years++;
        }
    }
    
    public int getYears() {
        return years;
    }
}
