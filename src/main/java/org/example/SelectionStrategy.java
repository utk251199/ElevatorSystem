package org.example;

import java.util.List;

public interface SelectionStrategy {

    Elevator select(List<Elevator> elevators,int floorNumber, Direction direction);
}
