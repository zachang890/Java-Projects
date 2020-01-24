
/**
 * Prompts user for answer to short answer questions.
 * 
 * @author Zachary Chang & Kevin Zhang
 * @version July 18, 2016
 */
import java.util.Scanner;

public class QuizToTake
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        Question science = new Question();
        
        science.setText("Which came first, the chicken or the egg?");
        science.display();
        science.setAnswer("egg");
        
        boolean checked = science.checkAnswer(kboard.nextLine());
        if(checked == true) {
            System.out.println("CORRECT");
        }
        else {
            System.out.println("WRONG! The correct answer is egg.");
        }
        
        Question science1 = new Question();
        
        science1.setText("Is ATDP fun?");
        science1.display();
        science1.setAnswer("yes");
        
        boolean checked1 = science1.checkAnswer(kboard.nextLine());
        if(checked1 == true) {
            System.out.println("Ok good.");
        }
        else {
            System.out.println("What??????");
        }
        
        ChoiceQuestion sciencey = new ChoiceQuestion();
        
        sciencey.setText("Who should you vote for?");
        
        sciencey.addChoice("Ryan Higa", true);
        sciencey.addChoice("George Washington", false);
        sciencey.addChoice("Bob the Builder", false);
        sciencey.addChoice("A chair", false);
        sciencey.display();
        sciencey.setAnswer("1");
        System.out.println("Type the number of what you think is the correct answer: ");
        
        
        boolean checked2 = sciencey.checkAnswer(kboard.nextLine());
        if(checked2 == true) {
            System.out.println("Ok good.");
        }
        else {
            System.out.println("What?????? The correct answer is Ryan Higa.");
        }
        
        NumericQuestion mathy = new NumericQuestion();
        
        mathy.setText("Using a calculator, find the sine of 65, rounding to the nearest hundredth.");
        mathy.display();
        mathy.setAnswer(0.9, 0.91, 0.92);
        
        boolean checked3 = mathy.checkAnswer(kboard.nextDouble());
        if(checked3 == true) {
            System.out.println("CORRECT");
        }
        else {
            System.out.println("WRONG! The correct answer is 0.91.");
        }
        
        MultiChoiceQuestion brainy = new MultiChoiceQuestion();
        
        brainy.setText("Which are the two spaces on a Monopoly board that allow players to draw cards? (Please write the words separated by a space)");
        
        brainy.addChoice("Chance");
        brainy.addChoice("LuxuryTax");
        brainy.addChoice("CommunityChest");
        brainy.addChoice("WaterWorks");
        brainy.display();
        brainy.setAnswer("Chance CommunityChest");
        
        kboard.nextLine();
        boolean checked4 = brainy.checkAnswer(kboard.nextLine());
        if(checked4 == true) {
            System.out.println("CORRECT");
        }
        else {
            System.out.println("WRONG! The correct answer is Chance and CommunityChest.");
        }
    }
}

