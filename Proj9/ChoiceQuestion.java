
/**
 * This class uses multiple choice
 * 
 * @author Zachary Chang 
 * @version July 18, 2016
 */
import java.util.ArrayList;

public class ChoiceQuestion extends Question
{   
    //fields
    private ArrayList<String> choices;
    
    //constructor
    public ChoiceQuestion() {
        choices = new ArrayList<String>();
    }
    
    //methods
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if(correct)
        {
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    
    public void display() {
        super.display();
        for(int i = 1; i < 5; i++) {
            System.out.println(i + "." + " " + choices.get(i-1));
        }
    }
}
