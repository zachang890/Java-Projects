
/**
 * Finds the date of the year Easter falls on for any year.
 * 
 * @author Zachary Chang
 * @version June 29, 2016
 */
import java.util.Scanner;

public class P4POINT2Easter
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Give me any year.");
        //y is the year
        int y = kboard.nextInt();
        int a = y%19;
        
        double b = (int)y/100;
        int c = y%100;
        
        double d = (int)b/4;
        int e = (int)b%4;
        
        double g = (int)((b*8)+13)/25;
        
        int h = (int)(a*19 + b - d - g + 15)%30;
        
        double j = (int)c/4;
        int k = c%4;
        
        double m = (int)(a + 11*h)/319;
        
        int r = (int)(2*e + 2*j - k - h + m + 32)%7;
        
        double n = (int)(h - m + r + 90)/25;
        
        int p = (int)(h - m + r + n + 19)%32;
        
        String march = "March";
        String april = "April";
        if (n == 3.0) {
        
        System.out.println("The date Easter falls on in year " + y + " is " + march + " " + p + ".");
    }
    
        else {
        System.out.println("The date Easter falls on in year " + y + " is " + april + " " + p + ".");
    }
    }
}
