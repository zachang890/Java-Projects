
/**
 * Write a description of class Practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Practice
{
    public static void main (String[] args)
    {
        //sortdat
        int temp;
        int n;
        
        Scanner kboard = new Scanner (System.in);
        System.out.println("How many values do u want to sort");
        
        n = kboard.nextInt();
        
        int lel[] = new int[n];
        
        System.out.println("GIMME THE VALS");
        
        for(int i = 0; i < n; i++)
        {
            lel[i] = kboard.nextInt();
        }
        
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (lel [i] > lel [j])
                {
                    temp = lel [i];
                    lel[i] = lel[j];
                    lel[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            if(i < n-1)
            {
                System.out.print(lel[i] + ", ");
            }
            else if(i == n - 1)
            {
                System.out.print(lel[i]);
            }
        }
    }
}
