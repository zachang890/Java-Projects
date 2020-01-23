
/**
 * This program reads a number and displays the square, cube, and fourth power.
 * 
 * @author Zachary Chang 
 * @version June 29, 2016
 */
public class E4POINT3MathPowers
{
    public static void main(String[] args)
    {
    double value = 4.0;
    System.out.println("The number is " + value);
    double square = value*value;
    System.out.println("The square of the number is " + square);
    double cube = value*value*value;
    System.out.println("The cube of the number is " + cube);
    double fourth = Math.pow(value, 4);
    System.out.println("The number to the fourth power is " + fourth);
}
}