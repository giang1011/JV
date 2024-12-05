class Bike extends Vehicle {
    private boolean isElectric;


    public Bike(String name, int speed, boolean isElectric) {
        super(name, speed);
        this.isElectric = isElectric;
    }

    @Override
    void move() {
        String type = isElectric ? "electric bike" : "bike";
        System.out.println(getName() + " (a " + type + ") is moving at " + getSpeed() + " km/h.");
    }
}
