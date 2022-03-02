package oop_exercise_vehicle.oop_exercise;

public class Car extends Vehicle {
    private int seat;
    private String type;

    public Car(String licensePlates, String brand, int yearOfManufacture, String owner, int seat, String type) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.seat = seat;
        this.type = type;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "," + seat + "," + type + "}";
    }


}
