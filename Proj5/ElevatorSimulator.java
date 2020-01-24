
/**
 * Simulates the actions of an actual elevator.
 * 
 * @author Zachary Chang
 * @version July 5, 2016
 */
import java.util.Scanner;

public class ElevatorSimulator
{
    public static void main(String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        int userFloor = 0, physFloor = 0;
        
        System.out.print("Push floor number (1-12, 14-20):");
        
        if (kBoard.hasNextInt()){
            userFloor = kBoard.nextInt();
            physFloor = userFloor;
            if (userFloor >= 1 && userFloor <=12) {
                //physFloor = userFloor;
                System.out.println("Will go to floor " + physFloor);
            }
            else if (userFloor == 13) { 
                System.out.println("Floor 13 does not exist");
            }
            else if (userFloor >= 14 && userFloor <= 20) {
                physFloor--;
                System.out.println("Will go to floor " + physFloor);
            }
            else {
                System.out.println(userFloor + " is not a good floor number");
            }
            
        }
        
        else {
            System.out.println("Not a good floor number");
        }
        
    }
}
