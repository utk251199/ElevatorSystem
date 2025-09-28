package org.example;

import java.util.List;

public class ElevatorController {

    List<Elevator> elevators;

    void requestElevator(int floor_number, Direction direction){
        elevators.getFirst().move(floor_number);                     //Dummy logic for now
    }
}
