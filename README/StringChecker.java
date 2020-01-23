
/**
 * Checks methods of the string class.
 * 
 * @author Zachary Chang 
 * @version July 1, 2016
 */
public class StringChecker
{
   public static void main(String[] args)
   {
       String numericStr = "0123456789";
       System.out.println("numericStr = " + numericStr);
       System.out.println("length = " + numericStr.length());
       System.out.println("substring 0, 3 = " + numericStr.substring(0, 3));
       System.out.println("substring 1, 5 = " + numericStr.substring(1, 5));
       
       System.out.println();
       
       String coName = "United States of America";
       System.out.println("coName = " + coName);
       int blank1Loc = coName.indexOf(" ");
       String word1 = coName.substring(0, blank1Loc);
       System.out.println("word1 = " + word1);
       
       int blank2Loc = coName.indexOf(" ", blank1Loc + 1);
       System.out.println("blank2Loc = " + blank2Loc);
       String word2 = coName.substring(blank1Loc + 1, blank2Loc);
       System.out.println("word2 = " + word2);
       
       System.out.println("");
       char cAt2 = coName.charAt(2);
       System.out.println("cAt2 = " + cAt2);
       
       System.out.println("");
       String newCo = coName.replace('a', '@');
       System.out.println("After replace:" );
       System.out.println("... coName " + coName);
       System.out.println("... newCo " + newCo);
       
       System.out.println("");
       newCo = coName.replace("me", "you");
       System.out.println("After replace:" );
       System.out.println("... coName " + coName);
       System.out.println("... newCo " + newCo);
   }
}
