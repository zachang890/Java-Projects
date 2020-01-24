
/**
 * Executes the actual calculator.
 * 
 * @author Zachary Chang 
 * @version June 30, 2016
 */
import java.util.Scanner;

public class BMICalculatorComponents
{
   public static void main(String[] args)
   {
       Scanner kboard = new Scanner(System.in);
       System.out.println("What is your name?");
       String name = kboard.nextLine();
       System.out.println("What is your age?");
       int age = kboard.nextInt();
       System.out.println("What is your weight in lbs?");
       int weight = kboard.nextInt();
       System.out.println("What is your height in inches?");
       int height = kboard.nextInt();
       
       BMICalculator value = new BMICalculator(name, age, weight, height);
       
       
       double kg = value.getKg(weight);
       double meters = value.getM(height);
       double bmi = value.getBmi(kg, meters);
       System.out.println("BMI of " + name + ", age " + age + ", is " + bmi + ".");
       
       
       
   }
}
