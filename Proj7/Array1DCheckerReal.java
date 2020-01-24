 /**
 * 1D arrays
 * 
 * @author Zachary Chang 
 * @version July 11, 2016
 */

import java.util.Arrays;

public class Array1DCheckerReal
{
    public static void main(String[] args)
    {
        //traverse forwards
        /*
        int[] values = {42, -51, 122, 200, 89};
        
        System.out.print("values = ");
        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        */
        //traverse backwards
        
        int[] values = {42, -51, 122, 200, 89};
        
        System.out.print("values = ");
        for(int i = values.length - 1; i < values.length && i >= 0; i--)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        
        
        /*
        //swap first and last
        int[] values = {42, -51, 122, 200, 89};
        
        int a = values[0]; //42
        values[0] = values[values.length-1]; //89
        values[values.length-1] = a; 
        
        System.out.print("values = ");
        for(int element : values)
        {
            System.out.print(element + " ");
        }
        */
        //find min val
        /*
        int[] values = {42, -51, 122, 200, 89};
        
        int minVal = values[0];
        int maxVal = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] < minVal)
            {
              minVal = values[i];
            }
            
            else if (values[i] > maxVal)
            {
                maxVal = values[i];
            }
        }
        System.out.println(minVal);
        System.out.println(maxVal);
        */
        
        /*
        //sum and average
        int[] values = {42, -51, 122, 200, 89};
        
        int total = 0;
        
        for(int element : values)
        {
            total = total + element;
        }
        
        double average = 0;
        if (values.length > 0)
        {
            average = total / values.length;
        }
        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);
        */
       
        //Sort
        /*
        int[] values = {42, -51, 122, 200, 89};
        Arrays.sort(values);
        for (int elements : values)
        {
            System.out.print(elements + ", ");
        }
        */
       
        //Binary search
        /*
        int[] values = {42, -51, 122, 200, 89};
        Arrays.binarySearch(values, 122);
        System.out.println(Arrays.binarySearch(values, 122));
        */
        
        //To string
        /*
        int[] values = {42, -51, 122, 200, 89};
        System.out.print(Arrays.toString(values));
        */
        
     }
}
