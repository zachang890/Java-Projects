
/**
 * Write a description of class RemoveElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveAddElement
{
    public static void main (String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        //Removing an element
        /*
        int[] bob = {44, 23, 65, 78, 88};
        for(int i = 0; i < bob.length-1; i++)
        {
            bob[i] = bob[i+1];
            System.out.print(bob[i] + " ");
        }
        */
       
        //Adding an element
        int[] bob = new int[5];
        for(int i = 0; i < bob.length - 1; i++)
        {
            System.out.println("wot number u want");
            bob[i] = kboard.nextInt();
        }
        
        for(int i = bob.length-1; i > 2; i--)
        {
            bob[i] = bob[i-1];
            
            
        }
        System.out.println("wot number u want at 2");
        bob[2] = kboard.nextInt();
        for(int i = 0; i < bob.length; i++)
        {
            System.out.print(bob[i] + " ");
        }
    }
}
