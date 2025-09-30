package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Elevator> elevators= new LinkedList<>();
        for(int i=0;i<3;i++){
            Elevator elevator = new Elevator(i+1,new SimpleLogging());
            elevators.add(elevator);
        }
        ElevatorController elevatorController = new ElevatorController(elevators,new NearestFirst());
        Floor floor = new Floor(1,elevatorController);
        floor.callElevatorController(Direction.UP);
        Elevator elevator = elevatorController.getElevators().get(0);
        InternalPanel internalPanel = new InternalPanel(elevator);
        internalPanel.pressButton(5);

    }
}