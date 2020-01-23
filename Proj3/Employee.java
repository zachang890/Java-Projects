
/**
 * Describes the salary methods and class for the Bank Account
 * 
 * @author Zachary Chang
 * @version Due 29, 2016
 */
public class Employee
{
    // instance variables 
    private String muLan;
    private double salary;

    
    /**
     * Employee Constructor
     * This constructor contains the client's name and their salary.
     * @param employeeName A parameter
     * @param currentSalary A parameter
     */
    public Employee(String employeeName, double currentSalary)
    {
        // initialise instance variables
        muLan = employeeName;
        salary = currentSalary;
    }

    /**
     * getName method
     * This method returns the name of the client.
     * @param no-args
     */
    public String getName()
    {
        // put your code here
        return muLan; 
    }
    
    /**
     * getSalary method
     * This method returns the salary of the client.
     * @param no-args
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * raiseSalary method
     * This method calculates salary raise for the client.
     * @param byPercent
     */
    public void raiseSalary(double byPercent)
    {
        salary = salary * 0.1 + salary;
    }
}
