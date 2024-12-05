import Interface.Fuelable;

class Car extends Vehicle implements Fuelable {
    private int fuelLevel;


    public Car(String name, int speed, int fuelLevel) {
        super(name, speed);
        this.fuelLevel = fuelLevel;
    }

    @Override
    void move() {
        System.out.println(getName() + " is moving at " + getSpeed() + " km/h.");
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println(getName() + " has been refueled to 100%.");
    }
}
