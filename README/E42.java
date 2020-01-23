
/**
 * Write a description of class E42 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E42
{
    public static final double WIDTH_VALUE = 8.5;
    public static final double LENGTH_VALUE = 11;
    
    public static void main(String[] args)
    {
        double perimeter = WIDTH_VALUE * 2 + LENGTH_VALUE * 2;
        System.out.println("The perimeter = " + perimeter);
        double diagonal = Math.pow(WIDTH_VALUE, 2.0) + Math.pow(LENGTH_VALUE, 2.0);
        double answer = Math.sqrt(diagonal);
        System.out.println(" ");
        System.out.println("The diagonal = " + answer);
}
}
