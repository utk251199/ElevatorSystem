package org.example;

public class Floor {
    int floorNumber;
    Direction direction;
    ElevatorController elevatorController;

    public Floor(int floorNumber,Direction direction){
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    void callElevatorController(int floorNumber,Direction direction){
        elevatorController.requestElevator(floorNumber,direction);
    }
}
