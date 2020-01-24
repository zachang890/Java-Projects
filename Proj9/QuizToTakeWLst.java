
/**
 * Write a description of class QuizToTakeWLst here.
 * 
 * @author Zachary Chang & Kevin Zhang
 * @version July 20, 2016
 */
import java.util.Scanner;
import java.util.ArrayList;
public class QuizToTakeWLst extends Question
{
    public static void main(String[] args)
    {
        
        ArrayList<String> question = new ArrayList<String>();
        
        
        Question science = new Question();
        
        science.setText("Which came first, the chicken or the egg?");
       
        science.setAnswer("egg");
        presentQuestion(science);
        
        
        
        Question science1 = new Question();
        
        science1.setText("Is ATDP fun?");
        
        science1.setAnswer("yes");
        presentQuestion(science1);
        
        
        ChoiceQuestion sciencey = new ChoiceQuestion();
        
        sciencey.setText("Who should you vote for?");
        
        sciencey.addChoice("Ryan Higa", true);
        sciencey.addChoice("George Washington", false);
        sciencey.addChoice("Bob the Builder", false);
        sciencey.addChoice("A chair", false);
        
        sciencey.setAnswer("1");
        System.out.println("Type the number of what you think is the correct answer: ");
        presentQuestion(sciencey);
        
        
        NumericQuestion mathy = new NumericQuestion();
        
        mathy.setText("Using a calculator, find the sine of 65, rounding to the nearest hundredth.");
        
        mathy.setAnswer(0.9, 0.91, 0.92);
        presentQuestion(mathy);
        
        
        MultiChoiceQuestion brainy = new MultiChoiceQuestion();
        
        brainy.setText("Which are the two spaces on a Monopoly board that allow players to draw cards? (Please write the words separated by a space)");
        
        brainy.addChoice("Chance");
        brainy.addChoice("LuxuryTax");
        brainy.addChoice("CommunityChest");
        brainy.addChoice("WaterWorks");
        
        brainy.setAnswer("Chance CommunityChest");
        question.add("Which are the two spaces on a Monopoly board that allow players to draw cards? (Please write the words separated by a space)");
        presentQuestion(brainy);
        
        
        
    }
    
    public static void presentQuestion(Question q) {
            ArrayList<Question> q1 = new ArrayList<Question>();
            q1.add(q);
            Scanner kboard = new Scanner(System.in);
            for(Question elements : q1) {
                q.display();
                String input = kboard.nextLine();
                if(elements.checkAnswer(input)) {
                    System.out.println("CORRECT");
                }
                else {
                    System.out.println("WRONG");
                }
                
            }
            
        }
    
}
