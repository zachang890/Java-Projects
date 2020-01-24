
/**
 * Write a description of class EmployeeIfElseExample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
    private double salary;
   private static final int OVERTIME_THRESHOLD = 40;
   private double average;
   private double newWage;
   

   /**
      Constructs an employee with a given salary
      @param anHourlySalary the hourly salary of this employee
   */
   public Employee(double anHourlySalary)
   {
      salary = anHourlySalary;
      average = 0;
   }

   /**
      Computes the wage for a given week.
      @param hoursWorked the hours worked in the week
      @return the wage earned in that week, taking overtime into account
   */
   public double weeklyWage(int hoursWorked)
   {
      // your work here
   if (hoursWorked >= 0 && hoursWorked <= OVERTIME_THRESHOLD){
   average = hoursWorked*salary;
   return average;
   }
   else if (hoursWorked > OVERTIME_THRESHOLD) {
   newWage = salary*1.5;
   average = (hoursWorked-OVERTIME_THRESHOLD)*newWage + (salary*OVERTIME_THRESHOLD);
   
   }
return average;
   }
}
