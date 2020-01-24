
/**
 * Write a description of class SortArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.Scanner;
public class SortArray
{
    public static void main (String[] args)
    {
        int n;
        int temp;
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter number of values to sort");
        
        n = kboard.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the values you want to sort");
        for(int i = 0; i < n; i++)
        {
            a[i] = kboard.nextInt();
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + ", ");
        }
    }
}
