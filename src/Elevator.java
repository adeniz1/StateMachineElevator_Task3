public class Elevator {
    public static int current_Floor = 5  ;
    int dest_Floor ;

     private Elv_States State = new Elv_States() ;

    public Elevator(int dest_Floor) {
        this.dest_Floor = dest_Floor ;
        System.out.println("Current Floor is " + Elevator.current_Floor);
        System.out.println("*** Destination floor is " + dest_Floor);
        arrive_atFloor();
    }
    private void arrive_atFloor() {
        if (current_Floor == dest_Floor) {
            if (State.current_ElvState == "Idle") {
                exit();
            }
            State.current_ElvState = State.idle;
            System.out.println("State of the Elevator: " + State.current_ElvState);
            System.out.println("You are on the Floor " + current_Floor );

        } else if (current_Floor > dest_Floor) {
            go_down();
        } else if (current_Floor < dest_Floor) {
            go_up();

        }

    }

    private void go_down(){
       State.current_ElvState=State.Moving_down ;
        System.out.println("State of the Elevator : "+ State.current_ElvState);
        System.out.println("...You are go down...");
        current_Floor = dest_Floor ;
        System.out.println("You are on the Floor " + current_Floor );


    }

    private void go_up(){
     State.current_ElvState = State.Moving_up ;
        System.out.println("State of the Elevator "+ State.current_ElvState);
        System.out.println("...You are go up...");
       current_Floor= dest_Floor ;
        System.out.println("You are on the Floor " + current_Floor );
    }

    private void exit(){
        System.out.println("Door of the elevator opening");
    }
}
