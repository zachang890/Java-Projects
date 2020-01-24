
/**
 * Superclass of the appointment subclasses.
 * 
 * @author Zachary Chang 
 * @version July 21, 2016
 */
public abstract class Appointment
{
    String type;
    int yr;
    int mh;
    int day;
    public Appointment(String t, int d, int m, int y){
        type = t;
        day = d;
        mh = m;
        yr = y;
    }
    
    public String getType(){
        return type;
    }
    
    public String toString() {
        return "You have a " + type + " appointment on " + mh + "/" + day + "/" + yr + ".";
    }
    
    public abstract boolean occursOn(int da, int mo, int ye);
}
