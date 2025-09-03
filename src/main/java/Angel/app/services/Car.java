package Angel.app.services;

import Angel.app.Interfaces.Driveable;

public class Car implements Driveable {
    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }
}
