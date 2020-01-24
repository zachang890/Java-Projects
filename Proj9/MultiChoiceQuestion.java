
/**
 * Defines methods of a question with multiple answers
 * 
 * @author Zachary Chang 
 * @version July 18, 2016
 */
import java.util.ArrayList;

public class MultiChoiceQuestion extends Question
{
    private ArrayList<String> choices3;
    
    public MultiChoiceQuestion() {
        choices3 = new ArrayList<String>();
    }
    
    public void addChoice(String choice) {
        choices3.add(choice);
    }
    
    public void display() {
        super.display();
        for(int i = 0; i < 4; i++) {
            System.out.println(choices3.get(i));
        }
    }
}
