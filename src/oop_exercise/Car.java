package oop_exercise;

public class Car extends Vehicle implements IAddVehicle, IDisplayVehicle, IDeleteVehicle {
    private int seat;
    private String type;

    public Car(String licensePlates, String brand, int yearOfManufacture, String owner, int seat, String type) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.seat = seat;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "," + seat + "," + type + "}";
    }

    @Override
    public void addVehicle() {
    }

    @Override
    public void displayVehicle() {
        System.out.println(this.toString());
    }

    @Override
    public void deleteVehicle() {

    }
}
