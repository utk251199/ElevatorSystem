package org.example;

public interface EventPublisher {

    void move(int id, int currentFloor, int destinationFloor);

    void openDoor(int id,int currentFloor);

    void closeDoor(int id);
}
