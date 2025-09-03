package Angel.app.services;

import Angel.app.Interfaces.Driveable;
import Angel.app.Interfaces.Flyable;

public class FlyingCar implements Driveable, Flyable {
    @Override
    public void drive() {
        System.out.println("Driving the flying card");
    }

    @Override
    public void fly() {
        System.out.println("Flying the car");
    }
}
