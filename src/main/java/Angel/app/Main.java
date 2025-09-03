package Angel.app;

import Angel.app.Interfaces.Driveable;
import Angel.app.Interfaces.Flyable;
import Angel.app.Interfaces.FlyingVehicle;
import Angel.app.services.Airplane;
import Angel.app.services.Car;
import Angel.app.services.FlyingCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();
        FlyingCar flyingCar = new FlyingCar();

        testVehicle(car);        // solo drive()
        testVehicle(airplane);   // solo fly()
        testVehicle(flyingCar);  // ambos: drive() y fly()

    }

    static void testVehicle(Object obj) {
        if (obj instanceof Driveable) {
            ((Driveable) obj).drive();
        }
        if (obj instanceof Flyable) {
            ((Flyable) obj).fly();
        }
    }
}