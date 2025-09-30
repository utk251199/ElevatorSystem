package org.example;

public class SimpleLogging implements EventPublisher {

    public void move(int id,int currentFloor,int destinationFloor) {
        System.out.println("Elevator " + id + " moving from " + currentFloor + " to " + destinationFloor);
    }

    public void openDoor(int id,int currentFloor) {
        System.out.println("Elevator " + id + " opening door at floor " + currentFloor);
    }

    public void closeDoor(int id) {
        System.out.println("Elevator " + id + " closing door");
    }
}
