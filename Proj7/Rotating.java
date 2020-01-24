
/**
 * Write a description of class Rotating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Rotating
{
    public static void main(String[] args)
    {
        int[] bob = {123, 56, 43, 12, 425, 32131};
        int temp = bob[bob.length-1];
        for(int i = bob.length-1; i > 0 ; i--)
        {
            bob[i] = bob[i - 1];
        }
        
        bob[0] = temp;
        
        for(int i = 0; i < bob.length; i++)
        {
            System.out.print(bob[i] + " ");
        }
    }
}
