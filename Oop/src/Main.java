import Interface.Fuelable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();


        vehicles.add(new Car("Toyota", 120, 50));
        vehicles.add(new Bike("Yamaha", 60, false));
        vehicles.add(new Bike("Tesla Bike", 80, true));


        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if (vehicle instanceof Fuelable) {
                ((Fuelable) vehicle).refuel();
            }
        }
    }
}
