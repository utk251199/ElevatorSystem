package org.example;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(0);
        floor.callElevatorController(Direction.UP);
        Elevator elevator = new Elevator(1);
        InternalPanel internalPanel = new InternalPanel(elevator);
        internalPanel.pressButton(5);

    }
}