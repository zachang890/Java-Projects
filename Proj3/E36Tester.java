
/**
 * Does printing of computed values
 * 
 * @author Zachary Chang and Jaiveer Singh
 * @version June 27, 2016
 */
public class E36Tester
{
    public static void main(String[] args)
    {
      E36 harrysChecking = new E36();
      
      
      harrysChecking.deposit(1000);
      System.out.println("After deposit :" + harrysChecking.getBalance());
      System.out.println("... expected: 1000"); 
      
      harrysChecking.withdraw(500);
      System.out.println("After withdraw :" + harrysChecking.getBalance());
      System.out.println("... expected: 500"); 
      
      harrysChecking.withdraw(400);
      System.out.println("After withdraw :" + harrysChecking.getBalance());
      System.out.println("... expected: 100"); 
}
}
