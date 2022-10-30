import javax.swing.*;
import java.util.Scanner ;


public class Main {
    public static void main (String[] args )   {

        Scanner in = new Scanner(System.in) ;

        System.out.println("Current Floor is " + Elevator.current_Floor);
        System.out.println("Enter destination Floor: (0 to 10):");
        int dest_floor = 0 ;
        System.out.println("--------------------------------------------");
        if(in.hasNextInt()){
             dest_floor = in.nextInt() ;
        } else {
            System.out.println("Error: Please enter a Number");
        }
        in.close();

        Elevator elv = new Elevator(dest_floor) ;


    }
}
