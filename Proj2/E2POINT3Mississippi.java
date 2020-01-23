
/**
 * Replaces the various letters in "Mississipi" with other letters
 * 
 * @author Zachary Chang
 * @version Due June 24, 2016
 */
public class E2POINT3Mississippi
{
   public static void main(String[] args)
   {
       String state = ("Mississippi");
       String statechange = state.replace("i", "ii");
       System.out.println(statechange.length());
       System.out.println(statechange.replace("ss", "s").length());
   }
}
