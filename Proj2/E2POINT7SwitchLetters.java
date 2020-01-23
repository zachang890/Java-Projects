
/**
 * Switches the letters "e" and "o".
 * 
 * @author Zachary Chang
 * @version Due June 24, 2016
 */
public class E2POINT7SwitchLetters
{
    public static void main(String[] args)
    {
        //break up the "Hello, World!" message
        String message = ("He");
        String messagechange = message.replace("e", "o");
        System.out.print(messagechange);
        
        String message2 = ("llo, ");
        String message2change = message2.replace("o", "e");
        System.out.print(message2change);
        
        String message3 = ("World!");
        String message3change = message3.replace("o", "e");
        System.out.print(message3change);
    }
}
