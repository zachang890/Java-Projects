
/**
 * Tests the methods of the various types of appointments.
 * 
 * @author Zachary Chang
 * @version July 21, 2016
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AppointmentTester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        ArrayList<Appointment> at = new ArrayList<Appointment>();
        OneTime once = new OneTime("Visit Parents", 8, 10, 2016);
        Monthly mon = new Monthly("Go to the doctor", 4, 1, 2016);
        Daily da = new Daily("Do your homework", 4, 1, 2016);
        
        at.add(once);
        at.add(mon);
        at.add(da);
        
        boolean end = false;
        while(!end){
            System.out.println("Find your appointment by typing the word find, add one by typing the word add, or press Q to quit.");
            String letter = kboard.nextLine();
            
            if(letter.equals("q") || letter.equals("Q")) {
                end = true;
            }
            
            else if(letter.equals("find")) {
                System.out.println("Enter the month you would like to search within: ");
                int mo = kboard.nextInt();
                System.out.println("Enter the day you would like to search for: ");
                int day = kboard.nextInt();
                System.out.println("Enter the year you would like to search within: ");
                int yea = kboard.nextInt();
                for(Appointment elements: at) {
                    if(elements.occursOn(mo, day, yea)) {
                        System.out.println(elements.toString());
                    }
                }
            }
            
            else if(letter.equals("add")) {
                System.out.println("Type d for daily, m for monthly, or o for onetime.");
                String type = kboard.nextLine();
                if(type.equals("d")) {
                    System.out.println("Enter a day to place the appointment in: ");
                    int monthy = kboard.nextInt();
                    System.out.println("Now give me a month: ");
                    int dayy = kboard.nextInt();
                    System.out.println("Now give me a year: ");
                    int yeary = kboard.nextInt();
                    System.out.println("Describe it: ");
                    kboard.nextLine();
                    String des = kboard.nextLine();
                    Daily dada = new Daily(des, dayy, monthy, yeary);
                    at.add(dada);
                }
                
                else if(type.equals("m")) {
                    System.out.println("Enter a day to place the appointment in: ");
                    int mm = kboard.nextInt();
                    System.out.println("Now give me a month: ");
                    int dd = kboard.nextInt();
                    System.out.println("Now give me a year: ");
                    int yy = kboard.nextInt();
                    System.out.println("Describe it: ");
                    kboard.nextLine();
                    String dess = kboard.nextLine();
                    Monthly momo = new Monthly(dess, dd, mm, yy);
                    at.add(momo);
                }
                
                else if(type.equals("o")) {
                    System.out.println("Enter a day to place the appointment in: ");
                    int mmm = kboard.nextInt();
                    System.out.println("Now give me a month: ");
                    int ddd = kboard.nextInt();
                    System.out.println("Now give me a year: ");
                    int yyy = kboard.nextInt();
                    System.out.println("Describe it: ");
                    kboard.nextLine();
                    String desss = kboard.nextLine();
                    OneTime onon = new OneTime(desss, ddd, mmm, yyy);
                    at.add(onon);
                }
            }
        }
        
        
    }
}
