package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    List<Elevator> elevators;
    SelectionStrategy selectionStrategy;

    ElevatorController(List<Elevator> elevators, SelectionStrategy selectionStrategy) {
        this.elevators = elevators;
        this.selectionStrategy = selectionStrategy;
    }

    void requestElevator(int floorNumber, Direction direction){
        Elevator selctedElevator = selectionStrategy.select(elevators,floorNumber, direction);
        selctedElevator.addRequest(floorNumber);
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

}
