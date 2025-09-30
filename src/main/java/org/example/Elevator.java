package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    private final int id;
    private int currentFloor;
    private State state;
    private final Queue<Integer> requests;
    private final EventPublisher eventPublisher;

    Elevator(int id,EventPublisher eventPublisher) {
        this.id = id;
        this.currentFloor = 0;
        this.state = State.IDLE;
        this.requests = new LinkedList<>();
        this.eventPublisher = eventPublisher;
    }

    public void addRequest(int destinationFloor) {
        requests.add(destinationFloor);
        if (state == State.IDLE) {
            processNextRequest();
        }
    }

    private void processNextRequest() {

        while (!requests.isEmpty()) {
            int destination = requests.poll();
            state = State.MOVING;
            eventPublisher.move(id, currentFloor, destination);
            currentFloor = destination;
            eventPublisher.openDoor(id, currentFloor);
            eventPublisher.closeDoor(id);
        }
        state = State.IDLE;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public State getState() {
        return state;
    }
}
