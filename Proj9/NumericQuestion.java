
/**
 * Defines methods of a question with numeric answers.
 * 
 * @author Zachary Chang 
 * @version July 18, 2016
 */
import java.util.ArrayList;

public class NumericQuestion extends Question 
{
   private ArrayList<Double> values;
   
   public NumericQuestion() {
       values = new ArrayList<Double>();
   }
   
   public void setAnswer(double answer, double answer1, double answer2){
       values.add(answer);
       values.add(answer1);
       values.add(answer2);
   }
   
   public boolean checkAnswer(double response) {
       if(response == values.get(0) || response == values.get(1) || response == values.get(2)) {
           return true;
       }
       else {
           return false;
       }
   }
}