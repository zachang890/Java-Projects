
/**
 * Write a description of class Daily here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daily extends Appointment
{
    public Daily(String type, int day, int month, int year) {
        super(type, day, month, year); // super const
    }
    
    public boolean occursOn(int da, int mo, int ye) {
        return (day == da) && (mh == mo);
    }
}
