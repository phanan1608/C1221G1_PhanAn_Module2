package oop_exercise;

public class Truck extends Vehicle implements IAddVehicle, IDeleteVehicle, IDisplayVehicle {
    private double tonnage;

    public Truck(String licensePlates, String brand, int yearOfManufacture, String owner, double tonnage) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "," + tonnage;
    }

    @Override
    public void deleteVehicle() {
    }

    @Override
    public void displayVehicle() {
        
    }

    @Override
    public void addVehicle() {

    }
}
