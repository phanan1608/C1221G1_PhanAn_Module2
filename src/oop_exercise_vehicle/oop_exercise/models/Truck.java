package oop_exercise_vehicle.oop_exercise.models;

public class Truck extends Vehicle {
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
        return "Truck{" + super.toString() + "," + tonnage + "}";
    }


}
