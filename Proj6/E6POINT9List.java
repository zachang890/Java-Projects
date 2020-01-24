
/**
 * Write a description of class E6POINT9List here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class E6POINT9List
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = kboard.nextLine();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= word.length(); i++) {
            String first = word.substring(a, b);
            System.out.println(first);
            a++;
            b++;
        }
    }
}
