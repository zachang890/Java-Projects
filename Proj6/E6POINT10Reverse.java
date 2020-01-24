
/**
 * Prints a word backwards.
 * 
 * @author Zachary Chang 
 * @version July 8, 2016
 */
import java.util.Scanner;

public class E6POINT10Reverse
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = kboard.nextLine();
        
        int i = 1;
        int a = word.length() - 1;
        int b = word.length();
        while(i <= word.length()){
            i++;
            String line = word.substring(a, b);
            a--;
            b--;
            System.out.print(line);
            
        }
        
    }
}
