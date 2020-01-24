
/**
 * Write a description of class OneTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneTime extends Appointment
{
    public OneTime(String type, int day, int month, int year) {
        super(type, day, month, year);
    }
    
    public boolean occursOn(int da, int mo, int ye) {
        return (day == da) && (mh == mo) && (yr == ye);
    }
}
