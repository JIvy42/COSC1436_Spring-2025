// Vehicle.java (Base Class)
public class Vehicle {
    protected int speed;
    private double fuel;

    // Constructor
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle has started.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    // Final method to display fuel level
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters.");
    }

    // Getters and setters for fuel
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}

// Car.java (Subclass)
public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("The car has started. Buckle up!");
    }

    // Car-specific method: honk
    public void honk() {
        System.out.println("Beep Beep!");
    }

    // Getters and setters for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

//