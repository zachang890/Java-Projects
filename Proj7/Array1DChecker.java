
/**
 * Write a description of class Array1DChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class Array1DChecker
{
  public static void main(String[]args)
  {
    int [] numbers= new int[12];
    for (int i=numbers.length-1; i>=0; i--)
    {
       Random rand=new Random();
       int a =rand.nextInt(111)-20;
       numbers [i]= a;
       System.out.println(numbers[i]);
       int g=numbers[0];
       int h=numbers[11];
       numbers[0]=g;
       numbers[11]=h;
       
       
    }
    System.out.println("\n"+numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);
    System.out.println(numbers[5]);
    System.out.println(numbers[6]);
    System.out.println(numbers[7]);
    System.out.println(numbers[8]);
    System.out.println(numbers[9]);
    System.out.println(numbers[10]);
    System.out.println(numbers[11]);
}
}
