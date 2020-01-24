import java.util.Scanner;

/**
 * Write a description of class SwitchName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class SwitchName
{
    public static void main(String[] args) {
    Scanner kboard= new Scanner(System.in);
    System.out.println("What is your first and last name?");
    String name= kboard.nextLine();
    // George Washington
    int a= name.indexOf(" ");
    String b= name.substring(0, a);
    String c= name.substring(a+1);
    String d= (c+", "+b);
    
    System.out.println("\n"+d);
    }
}
