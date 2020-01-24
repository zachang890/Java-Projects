
/**
 * Write a description of class CommonAlgorithm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class CommonAlgorithm
{
    public static void main(String[]args)
    {
      
      int max=0;
      int sum=0;
      int[] array={10,20,25,15,40,45,50,30,35,55};
      int min=array[0];
       for (int i=0;i<array.length; i++)
       {
         if (array[i]>max)
         {
           max=array[i];
           sum=sum+array[i];
         }
         else if(array[i]<min)
         {
           min=array[i];
           sum=sum+array[i];
            }
            
        
    }
    int average= sum/(array.length);
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
    System.out.println("Sum: "+sum);
    System.out.println("Average: "+average);
    //int sum=array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7];

    Arrays.sort(array);
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
    System.out.println(array[5]);
    System.out.println(array[6]);
    System.out.println(array[7]);
    System.out.println(array[8]);
    System.out.println(array[9]);
    
    int k= Arrays.binarySearch( array, 15);
    System.out.println(k);
    
    System.out.println(Arrays.toString(array));
}
}