public class Numbers
{
    private int blah;
    /**
    Computes a sum of even integers 
    @param a the lower bound (may be odd or even)
    @param b the upper bound (may be odd or even)
    @return the sum of even integers between a and b (inclusive).
     */
    public Numbers()
    {
       
    }
    public int evenSum(int a, int b)
    {
        if(a % 2 == 0)
        {
            a = a;
        }

        else
        {
            a = a + 1;
        }

        if(b % 2 == 0)
        {
            b = b;
        }

        else 
        {
            b = b-1;
        }

        int sum = 0;
        for(int i = 0; i < 1000; i+=2)
        {
            sum = sum + a + i;
            if(a + i == b)
            {
                break;
            }
        }

        return sum;

   
    }
}
