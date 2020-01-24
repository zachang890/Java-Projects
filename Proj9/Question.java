
/**
 * Defines constructor and methods for the Quiz.
 * 
 * @author Zachary Chang & Kevin Zhang 
 * @version July 18, 2016
 */
public class Question
{
    //fields
    private String text;
    private String answer;
    //constructor
    public Question() {
        text = "";
        answer = "";
    }
    //methods
    /**
     * This method saves the question.
     * @param String question
     * @return void
     */
    public void setText(String question) {
        text = question;
    }
    
    /**
     * This method saves the answer.
     * @param String answerText
     * @return void
     */
    public void setAnswer(String answerText) {
        answer = answerText;
    }
    
    /**
     * This method checks the answer of the user.
     * @param String response
     * @return boolean
     */
    public boolean checkAnswer(String response) {
        if(response.equals(answer)) {
            return true;
        }
        else {
        return false;
        }
    }
    
    /**
     * This method displays the question.
     * @param n/a
     * @return print text
     */
    public void display() {
        System.out.println(text);
    }
}

