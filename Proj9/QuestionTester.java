
/**
 * Tests the Question class.
 * 
 * @author Zachary Chang & Kevin Zhang 
 * @version July 18, 2016
 */
public class QuestionTester
{
    public static void main(String[] args)
    {
        Question science = new Question();
        science.setText("Which came first the chicken or the egg?");
        science.display();
        science.setAnswer("Egg");
        boolean checked = science.checkAnswer("Chicken");
        if(checked == true) {
            System.out.println("CORRECT");
        }
        else {
            System.out.println("WRONG");
        }
    }
}
