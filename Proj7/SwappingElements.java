
/**
 * Write a description of class SwappingElements here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class SwappingElements
{
    public static void main(String[] args)
    {
        int[] bob = {123, 56, 43, 12, 425, 32131};
        int temp = bob[2];
        bob[2] = bob[4];
        bob[4] = temp;
        
        for(int i = 0; i < bob.length; i++)
        {
            System.out.print(bob[i] + " ");
        }
    }
}
