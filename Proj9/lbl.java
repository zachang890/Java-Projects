
/**
 * Write a description of class lbl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lbl
{
    public static void main (String[] args)
    {
        int i = 1;
        int sum = 1;
        for (int j = 1; j < 31; j++)
        {
            i = i*2;
            sum = sum + i;
        }
        
        double result = sum/100;
        System.out.println(result);
    }
}
