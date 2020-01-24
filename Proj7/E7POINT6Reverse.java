
/**
 * Write a description of class E7POINT6Reverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E7POINT6Reverse
{
    public static void main(String[] args)
    {
        int[] values = {4, 1, 2, 3};

        for(int i = values.length-1; i < values.length && i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
