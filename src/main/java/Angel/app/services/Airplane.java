package Angel.app.services;

import Angel.app.Interfaces.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying the airplane...");
    }
}