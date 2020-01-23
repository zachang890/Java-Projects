
/**
 * Write a description of class Brah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class ChangeItoExclamation
{
    public static void main (String[] args)
    {
        Scanner kboard = new Scanner (System.in);
        System.out.println("Give me a word");
        String word = kboard.nextLine();
        
        String blah = "";
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals("i"))
            {
                blah = word.replace(word.substring(i, i+1), "!");
            }
        }
        
        System.out.println(blah);
    }
}
