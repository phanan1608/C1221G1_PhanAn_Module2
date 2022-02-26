package oop_exercise;

public class Motorbike extends Vehicle implements IDisplayVehicle, IAddVehicle, IDeleteVehicle {
    private double capacity;

    public Motorbike(String licensePlates, String brand, int yearOfManufacture, String owner, double capacity) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() + "," + capacity +
                '}';
    }

    @Override
    public void addVehicle() {

    }

    @Override
    public void deleteVehicle() {

    }

    @Override
    public void displayVehicle() {

    }
}
