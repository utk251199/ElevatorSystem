package org.example;

import java.util.List;

public class InternalPanel {

    List<Button> buttons;
    Elevator elevator;

    public InternalPanel(Elevator elevator){
        this.elevator = elevator;
    }

    void pressButton(int floorNumber){
        elevator.addRequest(floorNumber);
    }
}
