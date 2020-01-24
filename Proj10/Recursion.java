
/**
 * Write a description of class x here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
   public static int nFactorial(int n) {
       if (n <= 1) {
           return 1;
        }
       else {
           return n * nFactorial(n-1);
        }
   }
   
   public static int sumOfSqs(int n) {
       if (n <= 1) {
           return 1;
        }
       else {
           return n * n + sumOfSqs(n-1);
        }
   }
   
   public static int fib(int n) {
       if (n <= 2) {
           return 1;
        }
       else {
           return fib(n-1) + fib(n-2);
        }
   }
   
   public static void main(String[] args) {
       System.out.printf("nFactorial: %,d\n", nFactorial(6)); // which n value will overflow the result?
       System.out.printf("sumOfSqs: %,d\n", sumOfSqs(5));
       System.out.printf("fib: %,d\n", sumOfSqs(4));
    }

}
