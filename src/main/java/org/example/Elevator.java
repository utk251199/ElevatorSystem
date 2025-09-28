package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    int id;
    int currentFloor;
    InternalPanel internalPanel;
    State state;
    Queue<Integer> requests;

    Elevator(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.state = State.IDLE;
        this.requests = new LinkedList<>();
        this.internalPanel = new InternalPanel(this);
    }

    public void addRequest(int destinationFloor) {
        requests.add(destinationFloor);
        if (state == State.IDLE) {
            processNextRequest();
        }
    }

    private void processNextRequest() {
        if (requests.isEmpty()) {
            state = State.IDLE;
            return;
        }

        int destination = requests.poll();
        state = State.MOVING;
        move(destination);
        openDoor();
        closeDoor();

        processNextRequest();
    }

    void move(int destinationFloor) {
        System.out.println("Elevator " + id + " moving from " + currentFloor + " to " + destinationFloor);
        this.currentFloor = destinationFloor;
    }

    void openDoor() {
        System.out.println("Elevator " + id + " opening door at floor " + currentFloor);
    }

    void closeDoor() {
        System.out.println("Elevator " + id + " closing door");
    }
}
