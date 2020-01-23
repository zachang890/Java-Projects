
/**
 * Write a description of class Rand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Rand
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        int real;
        real = rand.nextInt(6) + 1;
        //random.nextInt(max - min + 1) + min
        System.out.println(real);
    }
}
