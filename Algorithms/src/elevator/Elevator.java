package elevator;

public class Elevator {
	
    private int floor = 0, choice1, person = 0;

    public void callFrom(int floor){
        System.out.println("Elevator is coming");
        goTo(floor);
    }

    public void goTo(int floor){
        if(floor == choice1) {
            System.out.println("Enter the elevator");
        }
        else if(floor > choice1) {
            elevatorDown();
        }

        else if(floor < choice1){
            elevatorUp();
        }
    }

    public void elevatorUp() {
        System.out.println("The elevator is on it's way up...");

        for (person = choice1; choice1>=floor; floor++)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }

    public void elevatorDown() {
        System.out.println("The elevator is on it's way down...");
        for (person = choice1; choice1<=floor; floor--)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }
}