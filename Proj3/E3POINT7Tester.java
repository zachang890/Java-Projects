
/**
 * Reveals computations
 * 
 * @author Zachary Chang 
 * @version June 27, 2016
 */
public class E3POINT7Tester
{
    public static void main(String[] args)
  {
    E3POINT7 momsSavings = new E3POINT7();
      System.out.println("After new :" + momsSavings.getBalance());
      System.out.println("... expected: 0"); 
      
      momsSavings.deposit(1000);
      System.out.println("After deposit :" + momsSavings.getBalance());
      System.out.println("... expected: 1000");
      
      momsSavings.addInterest(10);
      System.out.println("After interest :" + momsSavings.getBalance());
      System.out.println("... expected: 1100"); 
    }
}
