
/**
 * Write a description of class PhoneNumberTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PhoneNumberTester
{
    public static void main(String[] args)
    {
        PhoneNumbers numb = new PhoneNumbers();
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Gimme");
        String phone = kboard.nextLine();
        String blah = numb.cleanNumber(phone);
        
        System.out.println(blah);
    }
}
