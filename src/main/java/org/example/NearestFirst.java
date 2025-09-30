package org.example;

import java.util.List;

public class NearestFirst implements SelectionStrategy{

    public Elevator select(List<Elevator> elevators, int floorNumber, Direction direction) {
        Elevator best = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - floorNumber);
            if (elevator.getState() == State.IDLE) {
                return elevator; // prefer idle
            }
            if (distance < minDistance) {
                minDistance = distance;
                best = elevator;
            }
        }
        return best != null ? best : elevators.getFirst(); // fallback
    }
}
