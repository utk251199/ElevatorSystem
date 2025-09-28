package org.example;

public class Floor {
    int floorNumber;
    ElevatorController elevatorController;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        this.elevatorController = new ElevatorController();
    }

    void callElevatorController(Direction direction){
        elevatorController.requestElevator(floorNumber, direction);
    }
}
