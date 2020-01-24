public class PhoneNumbers
{
   /**
      Cleans a phone number.
      @param phoneNumber a phone number that should contain ten digits and possibly other characters
      @return the phone number in the form (###) ###-#### or the string "Error" if phoneNumber
      does not have ten digits
   */
   public PhoneNumbers()
   {
   }
   public String cleanNumber(String phoneNumber)
   {   
      
      String last = "";
      for (int i = 0; i < phoneNumber.length(); i++)
      {
         char ch = phoneNumber.charAt(i);
         
         if (Character.isDigit(ch))
         {
            last = last + ch;
         }          
      }
      if(last.length() == 10)
      {
         last = last;
      }
      
      else
      {
         return "Error";
      }
      
      return "(" + last.substring(0,3) + ")" + last.substring(3,6) + "-" + last.substring(6,last.length());
   }   
}
