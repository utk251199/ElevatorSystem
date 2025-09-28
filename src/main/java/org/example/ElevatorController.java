package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    List<Elevator> elevators;

    ElevatorController(){
        Elevator elevator = new Elevator(1);
        this.elevators = new ArrayList<>();
        this.elevators.add(elevator);
    }

    void requestElevator(int floor_number, Direction direction){
        elevators.getFirst().move(floor_number);                     //Dummy logic for now
    }
}
