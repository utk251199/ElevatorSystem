package org.example;

public class Elevator {

    int id;
    int currentFloor;
    InternalPanel internalPanel;
    State state;

    void move(int destinationFloor){
        this.currentFloor = destinationFloor;
    }
}
