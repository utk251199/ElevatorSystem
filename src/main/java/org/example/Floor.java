package org.example;

public class Floor {
    int floorNumber;
    ElevatorController elevatorController;

    public Floor(int floorNumber,ElevatorController elevatorController){
        this.floorNumber = floorNumber;
        this.elevatorController = elevatorController;
    }

    void callElevatorController(Direction direction){
        elevatorController.requestElevator(floorNumber, direction);
    }
}
